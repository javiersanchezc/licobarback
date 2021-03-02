package com.licobar.app.licobarBack.controller;


import com.licobar.app.licobarBack.repository.entity.Categoria;
import com.licobar.app.licobarBack.service.IcategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@Api(value = "Users microservice", description = "This API has a CRUD for users")
public class categoriacontroller {

    @Autowired
    IcategoriaService icategoriaService;


    @GetMapping("/categoria")
    @ApiOperation(value = "Find an user", notes = "Return a user by Id" )

    public List<Categoria> Consulta(){

        return icategoriaService.findall();
    }
}
