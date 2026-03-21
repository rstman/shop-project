package com.shop.model;

public class CartItem {
   private int id;
   private Product product;
   private int quantity;

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

   public CartItem(int var1, Product var2, int var3) {
      this.id = var1;
      this.product = var2;
      this.quantity = var3;
   }
}
