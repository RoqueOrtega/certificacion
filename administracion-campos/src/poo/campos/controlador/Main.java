/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.controlador;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Roque
 */
public class Main {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("****En el metodo main() de la clase: Main***");
        
        //PARA IMPLMENTACION de HIBERNATE
        SessionFactory sessionFactory = null;
        try 
        { 
            //Así esta en el tutorial de hibernate
            //Aca obtiene automaticamente el archivo: hibernate.cfg.xml con las configuraciones
            sessionFactory= new Configuration().configure().buildSessionFactory();

            System.out.println("***Se estableció la conexión con la base de datos.");
        } catch (HibernateException he) 
        { 
            System.err.println("Ocurrió un error en la inicialización de la SessionFactory: " + he); 
            throw new ExceptionInInitializerError(he); 
        }


        //Se crea un objeto de la clase: GestorCampos
        GestorCampos gestor= new GestorCampos(sessionFactory);        
        
        //Se llama a un metodo de la clase: GestorPelicula
        gestor.ejecutar();
    }
    
    

    
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        System.out.println("Conociendo el paradigma Orientado a Objetos");
//        
//        System.out.println("Se va instanciar una clase, setear sus atributos y luego mostrar.");
//        
//        //Crear un objeto de la clase Pelicula
//        Pelicula unaPelicula= new Pelicula();
//        //Seteo los valores de los atributos
//        unaPelicula.setAñoEstreno(new Long(1999));
//        unaPelicula.setNombre("Titanic");
//        unaPelicula.setDuracion("2:40");
//        unaPelicula.setDisponible(true);
//        unaPelicula.setTituloOriginal("Titanic Original");
//        
//        System.out.println("En el objeto: unaPelicula, el nombre es: "+unaPelicula.getNombre());
//        
//        
//        //Crear un objeto de la clase Pelicula
//        Pelicula unaPelicula1= new Pelicula();        
//        unaPelicula1.setNombre("La era del hielo");
        
        
        
//        System.out.println("Conociendo el paradigma Orientado a Objetos");
//        
//        System.out.println("Se va instanciar una clase, setear sus atributos y luego mostrar.");
//      
//        //Crear un objeto de la claseCine
//        Cine unObjetoCine1= new Cine();
//        //Seteo los valores de los atributos
//        unObjetoCine1.setNombre("Cine San Martin");
//        unObjetoCine1.setDireccion("San Martin 1930");
//        unObjetoCine1.setPrecioEntrada(new Double(75));
//        //Obtengo y muestro los valores seteados
//        System.out.println("Nombre: "+unObjetoCine1.getNombre());
//        System.out.println("Dirección: "+unObjetoCine1.getDireccion());
//        System.out.println("Precio: "+unObjetoCine1.getPrecioEntrada());
//        
//        //Crear un objeto de la claseCine
//        Cine unObjetoCine2= new Cine();
//        //Seteo los valores de los atributos
//        unObjetoCine2.setNombre("Cine Sarmiento");
//        unObjetoCine2.setDireccion("Sarmiento 760");
//        unObjetoCine2.setPrecioEntrada(new Double(130));
//        //Obtengo y muestro los valores seteados
//        System.out.println("Nombre: "+unObjetoCine2.getNombre());
//        System.out.println("Dirección: "+unObjetoCine2.getDireccion());
//        System.out.println("Precio: "+unObjetoCine2.getPrecioEntrada());        
        
