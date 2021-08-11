/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ruzbihan
 */
@Entity
@Table(name = "GMDB_MOVIE")
public class Movie implements Serializable{

    private int movieId;
    private String movieName;
    private String directors;
    private String runtime;
    private String actors;
    private double avgRating;
    private List<Customer> customers;
    private List<Genre> genres;
    private List<Review> reviews;

    public Movie() {
        genres = new ArrayList<>();
        customers = new ArrayList<>();

    }

    public Movie(String movieName, String directors, String runtime, String actors) {
        this.movieName = movieName;
        this.directors = directors;
        this.runtime = runtime;
        this.actors = actors;
        genres = new ArrayList<>();
        customers = new ArrayList<>();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getRuntime() {
        return runtime;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "GMDB_MOVIE_CUSTOMER",
            joinColumns = {
                @JoinColumn(name = "movieId")},
            inverseJoinColumns = {
                @JoinColumn(name = "customerId")})
    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "GMDB_MOVIE_GENRE",
            joinColumns = {
                @JoinColumn(name = "movieId")},
            inverseJoinColumns = {
                @JoinColumn(name = "genreId")})
    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    
    

}
