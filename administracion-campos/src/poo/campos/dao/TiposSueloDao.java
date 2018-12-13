/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.dao;

import java.util.List;
import poo.campos.clases.TipoSuelo;

/**
 *
 * @author roque.ortega
 */
public interface TiposSueloDao {
    
    public TipoSuelo buscarPorNombre (String nombre);
    
    public List<TipoSuelo> obtenerTodos ();
    
}
