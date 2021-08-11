/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.eao;

import com.uoc.hibernate.entity.Genre;

/**
 *
 * @author Ruzbihan
 */
public interface GenreEao {

    void create(Genre genre);
    
    void saveOrUpdate(Genre genre);
}
