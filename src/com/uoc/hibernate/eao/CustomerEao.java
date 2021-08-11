/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uoc.hibernate.eao;

import com.uoc.hibernate.entity.Customer;

/**
 *
 * @author Ruzbihan
 */
public interface CustomerEao {
    
    void create(Customer customer);
    
    void saveOrUpdate(Customer customer);
    
    Customer getCustomer(int customerId);
}
