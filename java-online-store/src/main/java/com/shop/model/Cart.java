package com.shop.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int id;
    private Customer customer;
    private List<CartItem> items = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public Cart(int id, Customer customer, List<CartItem> items) {
        this.id = id;
        this.customer = customer;
        this.items = items;
    }
}
