package com.spring_booters.checkout_service.dto;

import com.spring_booters.checkout_service.CustomAnnotation;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CheckoutRequestDto {
  @NotNull(message = "customer name cannot be empty")
  private String customerName;

  @NotNull(message = "cashier name cannot be empty")
  private String cashierName;

  @NotEmpty
  @Valid
  private ArrayList<CheckoutProductItem> products;

  @DecimalMin(value = "0")
  @Positive
  @CustomAnnotation
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

  public static void main(String[] args) {
    double a = 0.3;
    double b = 0.1 + 0.2;

    System.out.println(a == b);
    System.out.println(a);
    System.out.println(b);

    BigDecimal c = new BigDecimal("0.3");
    BigDecimal d = new BigDecimal("0.1");
    BigDecimal e = new BigDecimal("0.200");
    BigDecimal f = d.add(e);

    System.out.println(c.compareTo(f) == 0);
    System.out.println(f);
  }
}