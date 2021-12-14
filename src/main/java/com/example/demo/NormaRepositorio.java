/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Anthony
 */
public interface NormaRepositorio extends Repository<Norma, Integer>{
    List<Norma>findAll();
    Norma save(Norma n);
    void delete(Norma n);
    
}
