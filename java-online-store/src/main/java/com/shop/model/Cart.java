package com.shop.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
   private int id;
   private Customer customer;
   private List<CartItem> items = new ArrayList();

   public int getId() {
      return this.id;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public Customer getCustomer() {
      return this.customer;
   }

   public void setCustomer(Customer var1) {
      this.customer = var1;
   }

   public List<CartItem> getItems() {
      return this.items;
   }

   public void setItems(List<CartItem> var1) {
      this.items = var1;
   }

   public Cart(int var1, Customer var2, List<CartItem> var3) {
      this.id = var1;
      this.customer = var2;
      this.items = var3;
   }
}
