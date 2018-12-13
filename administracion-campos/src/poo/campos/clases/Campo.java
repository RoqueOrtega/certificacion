/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.clases;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author roque.ortega
 */
public class Campo {
    private Integer id;
    private String nombre;
    private BigDecimal superficie;
    
    //Relaciones con otras clases
    private EstadoCampo estado;
    private List<Lote> lotes;
    
    //CONSTRUCTORES
    public Campo() {
    }
    
    
    public Campo(String nombre, BigDecimal superficie, EstadoCampo estado) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.estado = estado;
    }

    public Campo(String nombre, BigDecimal superficie, EstadoCampo estado, List<Lote> lotes) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.estado = estado;
        this.lotes = lotes;
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

    public BigDecimal getSuperficie() {
        return superficie;
    }

    public void setSuperficie(BigDecimal superficie) {
        this.superficie = superficie;
    }

    public EstadoCampo getEstado() {
        return estado;
    }

    public void setEstado(EstadoCampo estado) {
        this.estado = estado;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes(List<Lote> lotes) {
        this.lotes = lotes;
    }

    
    @Override
    public String toString() {
        return nombre + ", superficie=" + superficie;
    }

    
    //METODOS necesarios para IMPLEMENTAR el CASO de USO Registrar Campo
    public BigDecimal getSuperficieLotes(){
        BigDecimal supLotes= BigDecimal.ZERO;
        //Se debe recorrer la lista de lotes agregados
        for (Lote loteAux: this.lotes){
            supLotes= supLotes.add(loteAux.getSuperficie());
        }
        return supLotes;
    }
    
    public boolean superficieCoincideConLaDeLotes() {
        //Se compara la superficie del campo con la de los lotes
        int res= this.superficie.compareTo(this.getSuperficieLotes());
        if( res == 0 ){//Entra si coinciden
            return true;
        }else{//Entra si NO coinciden
            return false;
        } 
    }     
    
    
    
}
