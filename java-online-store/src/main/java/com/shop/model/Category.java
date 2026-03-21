package com.shop.model;

public class Category {
   private int id;
   private String name;
   private String description;

   public int getId() {
      return this.id;
   }

   public void setId(int var1) {
      this.id = var1;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String var1) {
      this.name = var1;
   }

   public String getDescription() {
      return this.description;
   }

   public void setDescription(String var1) {
      this.description = var1;
   }

   public Category(int var1, String var2, String var3) {
      this.id = var1;
      this.name = var2;
      this.description = var3;
   }
}
