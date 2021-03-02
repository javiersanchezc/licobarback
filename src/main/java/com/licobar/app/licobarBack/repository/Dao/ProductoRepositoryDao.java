package com.licobar.app.licobarBack.repository.Dao;


import com.licobar.app.licobarBack.repository.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoRepositoryDao extends CrudRepository<Producto,Integer> {
}
