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

   public void setId(int id){
      this.id = id;
   }

   public Category getCategory() {
      return this.category;
   }

   public void setCategory(Category category) {
      this.category = category;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public BigDecimal getPrice() {
      return this.price;
   }

   public void setPrice(BigDecimal price) {
      this.price = price;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getStockQuantity() {
      return this.stockQuantity;
   }

   public void setStockQuantity(int setStockQuantity) {
      this.stockQuantity = setStockQuantity;
   }

   public Product(int id, Category category, String stockString, BigDecimal price, String description, int stockQuantity) {
      this.id = id;
      this.category = category;
      this.name = stockString;
      this.price = price;
      this.description = description;
      this.stockQuantity = stockQuantity;
   }
}
