package com.licobar.app.licobarBack.repository.entity;

import javax.persistence.*;

@Entity(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCategory")
    private int idCategory;

    @Column
    private String nameCategory;

    @Column
    private String rutaCategory;

    @Column
    private int statusCategory;
    @Column
    private  int descricionCategory;

    public int getDescricionCategory() {
        return descricionCategory;
    }

    public void setDescricionCategory(int descricionCategory) {
        this.descricionCategory = descricionCategory;
    }

    public int getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(int idCategory) {
        this.idCategory = idCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;





    }

    public String getRutaCategory() {
        return rutaCategory;
    }

    public void setRutaCategory(String rutaCategory) {
        this.rutaCategory = rutaCategory;
    }

    public int getStatusCategory() {
        return statusCategory;
    }

    public void setStatusCategory(int statusCategory) {
        this.statusCategory = statusCategory;
    }
}
