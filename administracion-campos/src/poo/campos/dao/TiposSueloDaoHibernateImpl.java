/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.campos.dao;

import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import poo.campos.clases.TipoSuelo;

/**
 *
 * @author roque.ortega
 */
public class TiposSueloDaoHibernateImpl implements TiposSueloDao{

    private final SessionFactory sessionFactory;

    public TiposSueloDaoHibernateImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public TipoSuelo buscarPorNombre(String nombre) {
        Session session = sessionFactory.openSession();
        
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<TipoSuelo> query = builder.createQuery(TipoSuelo.class);
        Root<TipoSuelo> root = query.from(TipoSuelo.class);
        query.select(root);
        query.where(builder.equal(root.get("nombre"), nombre));
        
        TipoSuelo tipoSuelo = session.createQuery(query).uniqueResult();
        
        session.close();
        
        return tipoSuelo;
    }


    @Override
    public List<TipoSuelo> obtenerTodos() {
        Session session = sessionFactory.openSession();
        List<TipoSuelo> retorno = session.createQuery("from TipoSuelo").list();
        session.close();
        
        return retorno;
    }    
    
}
