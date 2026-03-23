package com.shop.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
   private int id;
   private Customer customer;
   private List<OrderItem> items = new ArrayList();
   private BigDecimal totalAmount;
   private OrderStatus status;
   private LocalDateTime createdAt;

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public Customer getCustomer() {
      return this.customer;
   }

   public void setCustomer(Customer customer) {
      this.customer = customer;
   }

   public List<OrderItem> getItems() {
      return this.items;
   }

   public void setItems(List<OrderItem> orderItems) {
      this.items = orderItems;
   }

   public BigDecimal getTotalAmount() {
      return this.totalAmount;
   }

   public void setTotalAmount(BigDecimal totalAmount) {
      this.totalAmount = totalAmount;
   }

   public OrderStatus getStatus() {
      return this.status;
   }

   public void setStatus(OrderStatus status) {
      this.status = status;
   }

   public LocalDateTime getCreatedAt() {
      return this.createdAt;
   }

   public void setCreatedAt(LocalDateTime createdAt) {
      this.createdAt = createdAt;
   }

   public Order(int id, Customer customer, List<OrderItem> items, BigDecimal totalAmount, OrderStatus status, LocalDateTime createdAt) {
      this.id = id;
      this.customer = customer;
      this.items = items;
      this.totalAmount = totalAmount;
      this.status = status;
      this.createdAt = createdAt;
   }
}
