/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.controlador;

import java.util.List;
import org.hibernate.SessionFactory;
import poo.campos.clases.Campo;
import poo.campos.clases.EstadoCampo;
import poo.campos.clases.TipoSuelo;
import poo.campos.dao.CamposDao;
import poo.campos.dao.CamposDaoHibernateImpl;
import poo.campos.dao.EstadosCampoDao;
import poo.campos.dao.EstadosCampoDaoHibernateImpl;
import poo.campos.dao.TiposSueloDao;
import poo.campos.dao.TiposSueloDaoHibernateImpl;
import poo.campos.ui.PantallaRegistrarCampos;

/**
 *
 * @author Roque
 */
public class GestorCampos {
    //Variables miembros
    private final CamposDao camposDao;
    private final EstadosCampoDao estadosCampoDao;
    private final TiposSueloDao tiposSueloDao;
    
    //CONSTRUCTOR
    public GestorCampos(SessionFactory sessionFactory) {
        //System.out.println("En el constructor de la clase: GestorCampos");

        //Se crea las instancias de los objetos de acceso a datos
        this.camposDao = new CamposDaoHibernateImpl(sessionFactory);
        this.estadosCampoDao = new EstadosCampoDaoHibernateImpl(sessionFactory);
        this.tiposSueloDao = new TiposSueloDaoHibernateImpl(sessionFactory);
    }


    

    
    public void ejecutar(){
        //System.out.println("En el metodo ejecutar() de la clase: GestorCampos");
        // obtenemos los objetos para completar las listas de seleccion 
        List<TipoSuelo> tipos = tiposSueloDao.obtenerTodos(); 
        
        //Se crea un objeto de clase: PantallaRegistrarCampos y se le pasa 
        //la lista para el desplegable de TipoSuelo y ademas el gestor
        PantallaRegistrarCampos pantalla= new PantallaRegistrarCampos(tipos,this);
        pantalla.setVisible(true);  
    }//Fin del metodo ejecutar
   
    
    public boolean yaExisteElNombreDelCampo(String nombeCampo) {
        Campo campEncontrado=this.camposDao.buscarPorNombre(nombeCampo);
        //Verifico si encontro un campo
        return campEncontrado != null; //Entra si retorno null (no existe campo con ese nombre)     
    }
    
    
    
    public void guardarCampo(Campo campo) {
        //Ahora se debe setear el estado por defecto (Creado)
        EstadoCampo estadoCreado = estadosCampoDao.buscarPorNombre("Creado");
        campo.setEstado(estadoCreado);
        
        //Se persiste el campo y lotes que se setearon en él
        camposDao.guardar(campo);     
    }    
    
 
    
}
