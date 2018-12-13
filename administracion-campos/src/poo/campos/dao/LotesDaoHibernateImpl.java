/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.campos.clases.Lote;

/**
 *
 * @author roque.ortega
 */
public class LotesDaoHibernateImpl implements LotesDao{

    private final SessionFactory sessionFactory;

    public LotesDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Lote buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Lote> query = builder.createQuery(Lote.class);
        Root<Lote> root = query.from(Lote.class);
        query.select(root);
        query.where(builder.equal(root.get("nombre"), nombre));
        
        Lote lote = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return lote;
    }    
    
    

    @Override
    public void guardar(Lote lote) {
        System.out.println("En el metodo guardar() de la clase: LotesDaoHibernateImpl");
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(lote);
        session.getTransaction().commit();
        session.close();
    }
    
}
