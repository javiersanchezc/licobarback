package com.licobar.app.licobarBack.service;




import com.licobar.app.licobarBack.repository.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IproductoService {

    public List<Producto> findall();
    public Producto save(Producto productos);
    public Optional<Producto> findById(Integer  id_producto);
    public void delete(Producto producto);
}
