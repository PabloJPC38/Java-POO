
package com.eggNews.eggNews.entidades;

// @author Pablo

import com.eggNews.eggNews.enumeraciones.Rol;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Data
@Entity
public class Usuario {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    protected String Id;
    protected String user_name;
    protected String password;
    protected String email;
    @Temporal(value = TemporalType.DATE)
    protected Date fecha_alta;
    @Enumerated(EnumType.STRING)
    protected Rol rol;
    Boolean activo;
    
    

}
