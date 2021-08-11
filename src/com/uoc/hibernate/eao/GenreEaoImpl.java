/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.eao;

import com.uoc.hibernate.entity.Genre;
import com.uoc.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ruzbihan
 */
public class GenreEaoImpl implements GenreEao {

    SessionFactory sessionFactory;

    public GenreEaoImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void create(Genre genre) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(genre);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void saveOrUpdate(Genre genre) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(genre);

        session.getTransaction().commit();
        session.close();
    }

    public void delete(Genre genre) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(genre);

        session.getTransaction().commit();
        session.close();
    }

}
