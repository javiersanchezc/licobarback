package com.licobar.app.licobarBack.service;





import com.licobar.app.licobarBack.repository.entity.Tienda;

import java.util.List;
import java.util.Optional;

public interface ItiendaService {
    public List<Tienda> findall();
    public Tienda save(Tienda tiendas);
    public Optional<Tienda> findById(Integer  id_producto);
    public void delete(Tienda tiendas);

}
