/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.dao;

import poo.campos.clases.Campo;

/**
 *
 * @author roque.ortega
 */
public interface CamposDao {
    
    public Campo buscarPorNombre (String nombre);
    
    public void guardar (Campo campo);    
    
    
}
