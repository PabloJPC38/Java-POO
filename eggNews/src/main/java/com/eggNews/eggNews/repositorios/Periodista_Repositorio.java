/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.eggNews.eggNews.repositorios;

import com.eggNews.eggNews.entidades.Periodista;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Pablo
 */
public interface Periodista_Repositorio extends JpaRepository<Periodista, String>{
    
}
