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
import poo.campos.clases.Campo;
import poo.campos.clases.EstadoCampo;

/**
 *
 * @author roque.ortega
 */
public class EstadosCampoDaoHibernateImpl implements EstadosCampoDao{

    private final SessionFactory sessionFactory;

    public EstadosCampoDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public EstadoCampo buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<EstadoCampo> query = builder.createQuery(EstadoCampo.class);
        Root<EstadoCampo> root = query.from(EstadoCampo.class);
        query.select(root);
        query.where(builder.equal(root.get("nombre"), nombre));
        
        EstadoCampo estadoCampo = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return estadoCampo;
    }


    
}
