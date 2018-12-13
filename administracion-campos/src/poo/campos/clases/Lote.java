/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.clases;

import java.math.BigDecimal;

/**
 *
 * @author roque.ortega
 */
public class Lote {
    private Integer id;
    private Long numero;
    private BigDecimal superficie;  
    
    //Relaciones con otras clases
    private TipoSuelo tipoSuelo;
    
    
    
    //CONSTRUCTORES     
    public Lote() {
    }

    public Lote(Long numero, BigDecimal superficie, TipoSuelo tipoSuelo) {
        this.numero = numero;
        this.superficie = superficie;
        this.tipoSuelo = tipoSuelo;
    }


    

    //SETs y GETs 
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public BigDecimal getSuperficie() {
        return superficie;
    }

    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }

    public TipoSuelo getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(TipoSuelo tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    
    @Override
    public String toString() {
        return "Lote{" + "numero=" + numero + ", superficie=" + superficie + ", tipoSuelo=" + tipoSuelo + '}';
    }

    
    
    
    
}
