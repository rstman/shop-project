package com.shop.model;

import java.math.BigDecimal;

public class Product {
   private int id;
   private Category category;
   private String name;
   private BigDecimal price;
   private String description;
   private int stockQuantity;

   public int getId() {
      return this.id;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public Category getCategory() {
      return this.category;
   }

   public void setCategory(Category var1) {
      this.category = var1;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public BigDecimal getPrice() {
      return this.price;
   }

   public void setPrice(BigDecimal var1) {
      this.price = var1;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String var1) {
      this.description = var1;
   }

   public int getStockQuantity() {
      return this.stockQuantity;
   }

   public void setStockQuantity(int var1) {
      this.stockQuantity = var1;
   }

   public Product(int var1, Category var2, String var3, BigDecimal var4, String var5, int var6) {
      this.id = var1;
      this.category = var2;
      this.name = var3;
      this.price = var4;
      this.description = var5;
      this.stockQuantity = var6;
   }
}
