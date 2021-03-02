package com.licobar.app.licobarBack.service.impl;



import com.licobar.app.licobarBack.repository.Dao.CategoriaRepositoryDao;
import com.licobar.app.licobarBack.repository.entity.Categoria;
import com.licobar.app.licobarBack.service.IcategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class categoriaServiceimpl implements IcategoriaService {

    @Autowired
    CategoriaRepositoryDao categoriaRepositoryDao;
    @Override
    public List<Categoria> findall() {
        return (List<Categoria>) categoriaRepositoryDao.findAll();
    }

    @Override
    public Categoria save(Categoria categorias) {
        return null;
    }

    @Override
    public Optional<Categoria> findById(Integer id_producto) {
        return Optional.empty();
    }

    @Override
    public void delete(Categoria categoria) {

    }
}
