/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.eao;

import com.uoc.hibernate.entity.Movie;

/**
 *
 * @author Ruzbihan
 */
public interface MovieEao {

    void create(Movie movie);

    void saveOrUpdate(Movie movie);

    Movie getMovie(int movieId);

    void delete(int movieId);

    Movie getMovieByName(String movieName);

    Movie getMovies();
}
