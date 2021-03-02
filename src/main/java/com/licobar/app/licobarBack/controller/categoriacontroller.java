package com.licobar.app.licobarBack.controller;


import com.licobar.app.licobarBack.repository.entity.Categoria;
import com.licobar.app.licobarBack.service.IcategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class categoriacontroller {

    @Autowired
    IcategoriaService icategoriaService;


    @GetMapping("/categoria")
    public List<Categoria> Consulta(){

        return icategoriaService.findall();
    }
}
