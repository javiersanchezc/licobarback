package com.licobar.app.licobarBack.repository.entity;

import javax.persistence.*;

@Entity(name = "tienda")
public class Tienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tienda")
    private int id_tienda;

    @Column
    private String codigo_pais;
    @Column
    private String direccion;
    @Column
    private String email;
    @Column
    private int latitude;
    @Column
    private int longitude;
    @Column
    private String localidad;
    @Column
    private String nombre;
    @Column
    private String pais;
    @Column
    private String tlf;
    @Column
    private String comentarios1;
    @Column
    private String comentarios2;
    @Column
    private String comentarios3;
    @Column
    private String imagen;
    @Column
    private int estado;
    @Column
    private String fecha;

    public Number getId_tienda() {
        return id_tienda;
    }
    public void setId_tienda(int id_tienda) {
        this.id_tienda = id_tienda;
    }
    public String getCodigo_pais() {
        return codigo_pais;
    }
    public void setCodigo_pais(String codigo_pais) {
        this.codigo_pais = codigo_pais;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getLatitude() {
        return latitude;
    }
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
    public int getLongitude() {
        return longitude;
    }
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getTlf() {
        return tlf;
    }
    public void setTlf(String tlf) {
        this.tlf = tlf;
    }
    public String getComentarios1() {
        return comentarios1;
    }
    public void setComentarios1(String comentarios1) {
        this.comentarios1 = comentarios1;
    }
    public String getComentarios2() {
        return comentarios2;
    }
    public void setComentarios2(String comentarios2) {
        this.comentarios2 = comentarios2;
    }
    public String getComentarios3() {
        return comentarios3;
    }
    public void setComentarios3(String comentarios3) {
        this.comentarios3 = comentarios3;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public Number isEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}