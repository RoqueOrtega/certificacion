/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.clases;

/**
 *
 * @author roque.ortega
 */
public class TipoSuelo {
    private Integer id;
    private String nombre;
    private String descripcion; 

    
    //CONSTRUCTORES 
    public TipoSuelo() {
    }

    public TipoSuelo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    
    
    
    //SETs y GETs 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
//    @Override
//    public String toString() {
//        return "TipoSuelo{" + "nombre=" + nombre + ", descripcion=" + descripcion + '}';
//    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    

    
}
