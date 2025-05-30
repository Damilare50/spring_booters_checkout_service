package com.spring_booters.checkout_service.pojo;

import java.util.List;

public class Invoice {
  private double vat;
  private double total;
  private double netTotal;
  private double discount;
  private List<InvoiceItem> items;
  private String customerName;
  private String cashierName;

  public double getNetTotal() {
    return this.netTotal;
  }

  public void setNetTotal(double netTotal) {
    this.netTotal = netTotal;
  }

  public Invoice(String customerName, String cashierName) {
    this.vat = 0.075;
    this.customerName = customerName;
    this.cashierName = cashierName;
  }

  public Invoice() {
    this.vat = 0.075;
  }

  public void incrementTotal(double value) {
    this.setTotal(this.total + value);
  }

  public double getVat() {
    return this.vat;
  }

  public void setVat(double vat) {
    this.vat = vat;
  }

  public double getTotal() {
    return this.total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  public double getDiscount() {
    return this.discount;
  }

  public void setDiscount(double discount) {
    this.discount = discount;
  }

  public List<InvoiceItem> getItems() {
    return this.items;
  }

  public void setItems(List<InvoiceItem> items) {
    this.items = items;
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
}
