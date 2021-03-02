package com.licobar.app.licobarBack.service;


import com.licobar.app.licobarBack.repository.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface IcategoriaService {
    public List<Categoria> findall();
    public Categoria save(Categoria categorias);
    public Optional<Categoria> findById(Integer  id_producto);
    public void delete(Categoria categoria);
}
