/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.eao;

import com.uoc.hibernate.entity.Movie;
import com.uoc.hibernate.util.HibernateUtil;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Ruzbihan
 */
public class MovieEaoImpl implements MovieEao {

    //List<Movie> movies;
    SessionFactory sessionFactory;

    public MovieEaoImpl() {

        sessionFactory = HibernateUtil.getSessionFactory();
    }

    @Override
    public void create(Movie movie) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(movie);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void saveOrUpdate(Movie movie) {

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.saveOrUpdate(movie);

        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Movie getMovie(int movieId) {

        Session session = sessionFactory.openSession();
        Movie movie = (Movie) session.get(Movie.class, movieId);
        session.close();

        return movie;
    }

    @Override
    public Movie getMovieByName(String movieName) {
        Session session = sessionFactory.openSession();
        Movie movie = (Movie) session.get(Movie.class, movieName);
        session.close();

        return movie;

    }

    @Override
    public Movie getMovies() {

        Session session = sessionFactory.openSession();
        List movieList = session.createQuery("from GMDB_MOVIE").list();
        Iterator it = movieList.iterator();
        while (it.hasNext()) {
            Object ob = (Object) it.hasNext();
            Movie m = (Movie) ob;
            System.out.println("Movie ID: " + m.getMovieId() + ", Movie Name: " + m.getMovieName());
        }
        session.close();
        return (Movie) movieList;
    }

    @Override
    public void delete(int movieId) {
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.delete(movieId);

        session.getTransaction().commit();
        session.close();
    }

}
