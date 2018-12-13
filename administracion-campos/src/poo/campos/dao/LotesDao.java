/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.dao;

import poo.campos.clases.Lote;

/**
 *
 * @author roque.ortega
 */
public interface LotesDao {
       
    public Lote buscarPorNombre (String nombre);
    
    public void guardar (Lote lote);    
    
    
}
