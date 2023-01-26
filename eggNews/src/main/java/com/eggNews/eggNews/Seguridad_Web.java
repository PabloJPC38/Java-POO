
package com.eggNews.eggNews;

// @author Pablo


import com.eggNews.eggNews.servicios.Usuario_Servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration
@EnableWebMvcSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Seguridad_Web extends WebSecurityConfigurerAdapter{
    
    @Autowired
    public Usuario_Servicios user_service;
    
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        
        auth.userDetailsService(user_service)
                .passwordEncoder(new BCryptPasswordEncoder());
    
    }

    
    @Override
    protected void configure(HttpSecurity http)throws Exception{
        
        http
                .authorizeRequests().antMatchers("/admin/*").hasAnyRole("ADMIN","PERIOD")
                .antMatchers("/ccs/*","/js/*","/img/*","/**")
                .permitAll()
                .and().formLogin()
                .loginPage("/login")
                .loginProcessingUrl("/logincheck")
                .usernameParameter("email")
                .passwordParameter("password")
                .defaultSuccessUrl("/inicio")
                .permitAll()
                .and().logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
                .permitAll()
                .and().csrf()
                .disable();
                
                    
        
    }

}
