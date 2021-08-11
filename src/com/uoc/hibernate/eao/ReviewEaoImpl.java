/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.eao;

import com.uoc.hibernate.entity.Review;
import com.uoc.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ruzbihan
 */
public class ReviewEaoImpl implements ReviewEao {

    SessionFactory sessionFactory;

    public ReviewEaoImpl() {
        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void create(Review review) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(review);

        session.getTransaction().commit();
        session.close();
    }

    public void saveOrUpdate(Review review) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.saveOrUpdate(review);

        session.getTransaction().commit();
        session.close();
    }

    public void delete(Review review) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(review);

        session.getTransaction().commit();
        session.close();
    }

}
