package com.eggNews.eggNews.servicios;

// @author Pablo
import com.eggNews.eggNews.entidades.Periodista;
import com.eggNews.eggNews.entidades.Usuario;
import com.eggNews.eggNews.enumeraciones.Rol;
import com.eggNews.eggNews.excepciones.My_Exceptions;
import com.eggNews.eggNews.repositorios.Periodista_Repositorio;
import com.eggNews.eggNews.repositorios.Usuario_Repositorio;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Service
public class Usuario_Servicios implements UserDetailsService {

    @Autowired
    private Usuario_Repositorio usuario_respost;

    @Autowired
    private Periodista_Repositorio period_repost;

    @Transactional
    public void Registrar_Usuario(String user_name, String email, String password, String password2) throws My_Exceptions {

        Validar(user_name, email, password, password2);
        Usuario usuario = new Usuario();
        usuario.setUser_name(user_name);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.USER);
        usuario.setActivo(true);
        usuario_respost.save(usuario);

    }

    /**
     * *******************PERIODISTA************************************
     */
    @Transactional
    public void Registrar_Periodista(String user_name, String email, String password, String password2) throws My_Exceptions {

        Validar(user_name, email, password, password2);
        Periodista usuario = new Periodista();
        usuario.setUser_name(user_name);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(password));
        usuario.setRol(Rol.PERIOD);
        usuario_respost.save(usuario);

    }

    @Transactional
    public void Eliminar_Periodista(String Id) {

        period_repost.deleteById(Id);
    }

    @Transactional
    public void Dar_Baja(String Id) {

        Periodista periodista = usuario_respost.Buscar_Por_Id(Id);
        periodista.setActivo(false);
        period_repost.save(periodista);

    }

    @Transactional
    public void Dar_Alta(String Id) {

        Periodista periodista = usuario_respost.Buscar_Por_Id(Id);
        periodista.setActivo(true);
        period_repost.save(periodista);

    }

    @Transactional(readOnly = true)
    public List<Periodista> Listar_Periodistas() {

        List<Periodista> periodistas = new ArrayList();
        periodistas = period_repost.findAll();

        return periodistas;
    }

    @Transactional
    public void Agregar_Sueldo(String Id, Integer sueldo) {

        Periodista periodista = usuario_respost.Buscar_Por_Id(Id);
        periodista.setSueldo(sueldo);
        usuario_respost.save(periodista);
    }

    /**
     * ****************************************************************
     */

    private void Validar(String user_name, String email, String password, String password2) throws My_Exceptions {

        if (user_name.isEmpty() || user_name == null)
        {
            throw new My_Exceptions("El nombre no puede ser nulo o estar vacío");
        }

        if (email.isEmpty() || email == null)
        {
            throw new My_Exceptions("El correo electrónico no puede ser nulo o estar vacío");
        }

        if (password.isEmpty() || password == null)
        {
            throw new My_Exceptions("La contraseña no puede ser nulo o estar vacío");
        }

        if (password.length() <= 5)
        {

            throw new My_Exceptions("La contraseña no puede contener menos de 6 caracteres");

        }
        if (password2.isEmpty() || password2 == null || !password2.equals(password))
        {

            throw new My_Exceptions("No coinciden las contraseñas");
        }
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario usuario = usuario_respost.Buscar_Por_Email(email);

        if (usuario != null)
        {

            List<GrantedAuthority> permisos = new ArrayList();
            GrantedAuthority p;
//                        new SimpleGrantedAuthority("ROLE_"+usuario.getRol().USER.toString()); //USER

            if (usuario.getActivo())
            {

                p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());

            } else
            {

                p = new SimpleGrantedAuthority("ROLE_" + "USER");

            }

            permisos.add(p);
            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
            HttpSession session = attr.getRequest().getSession(true);
            session.setAttribute("usuariosession", usuario);

            return new User(usuario.getEmail(), usuario.getPassword(), permisos);

        }
    
        else{
        
            return null;
    }

}
}
