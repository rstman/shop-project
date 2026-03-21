package com.shop.model;

import java.math.BigDecimal;

public class OrderItem {
   private int id;
   private Product product;
   private int quantity;
   private BigDecimal price;

   public int getId() {
      return this.id;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public Product getProduct() {
      return this.product;
   }

   public void setProduct(Product var1) {
      this.product = var1;
   }

   public int getQuantity() {
      return this.quantity;
   }

   public void setQuantity(int var1) {
      this.quantity = var1;
   }

   public BigDecimal getPrice() {
      return this.price;
   }

   public void setPrice(BigDecimal var1) {
      this.price = var1;
   }

   public OrderItem(int var1, Product var2, int var3, BigDecimal var4) {
      this.id = var1;
      this.product = var2;
      this.quantity = var3;
      this.price = var4;
   }
}
