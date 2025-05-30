package com.spring_booters.checkout_service.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;

public class CheckoutRequestDto {
  @NotNull(message = "customer name cannot be empty")
  private String customerName;

  @NotNull(message = "cashier name cannot be empty")
  private String cashierName;

  @NotEmpty
  @Valid
  private ArrayList<CheckoutProductItem> products;

  @Min(value = 0)
  private double discount;

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public String getCustomerName() {
    return this.customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCashierName() {
    return this.cashierName;
  }

  public void setCashierName(String cashierName) {
    this.cashierName = cashierName;
  }

  public ArrayList<CheckoutProductItem> getProducts() {
    return this.products;
  }

  public void setProducts(ArrayList<CheckoutProductItem> products) {
    this.products = products;
  }
}