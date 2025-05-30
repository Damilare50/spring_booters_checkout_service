package com.spring_booters.checkout_service.dto;

import jakarta.validation.constraints.*;

public class CheckoutProductItem {
  @NotNull(message = "product name cannot be empty")
  private String name;

  @NotNull(message = "product price cannot be null")
  @Min(value = 1, message = "product price cannot be less than 1")
  private double price;

  @NotNull(message = "product quantity cannot be null")
  @Min(value = 1, message = "product quantity cannot be less than 1")
  private int quantity;

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
