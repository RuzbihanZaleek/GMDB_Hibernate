/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.eao;

import com.uoc.hibernate.entity.Customer;
import com.uoc.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ruzbihan
 */
public class CustomerEaoImpl implements CustomerEao {

    SessionFactory sessionFactory;

    public CustomerEaoImpl() {

        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void create(Customer customer) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(customer);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void saveOrUpdate(Customer customer) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.saveOrUpdate(customer);

        session.getTransaction().commit();
        session.close();
    }

    public void deleteCustomer(Customer customer) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(customer);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Customer getCustomer(int customerId) {

        Session session = sessionFactory.openSession();
        Customer customer = (Customer) session.get(Customer.class, customerId);

        session.close();
        return customer;
    }
}
