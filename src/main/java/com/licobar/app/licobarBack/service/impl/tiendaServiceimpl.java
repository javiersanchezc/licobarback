package com.licobar.app.licobarBack.service.impl;


import com.licobar.app.licobarBack.repository.Dao.TiendaRepositoryDao;
import com.licobar.app.licobarBack.repository.entity.Tienda;
import com.licobar.app.licobarBack.service.ItiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class tiendaServiceimpl implements ItiendaService {
    @Autowired
    TiendaRepositoryDao tiendaRepositoryDao;

    @Override
    public List<Tienda> findall() {
        return (List<Tienda>) tiendaRepositoryDao.findAll();
    }

    @Override
    public Tienda save(Tienda tiendas) {
        return null;
    }

    @Override
    public Optional<Tienda> findById(Integer id_producto) {
        return Optional.empty();
    }

    @Override
    public void delete(Tienda tiendas) {

    }
}
