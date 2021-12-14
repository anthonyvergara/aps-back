/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anthony
 */
@Service
public class NormaServiceImp implements NormaService{
    
    @Autowired
    private NormaRepositorio repositorio;
    
    @Override
    public List<Norma> listar() {
        return repositorio.findAll();
    }

    @Override
    public Norma add(Norma n) {
        return repositorio.save(n);
    }
    
}
