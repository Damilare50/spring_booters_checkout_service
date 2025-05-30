package com.spring_booters.checkout_service.pojo;

public class InvoiceItem {
  private Product product;
  private int quantityPurchased;

  public InvoiceItem(Product product, int quantityPurchased) {
    this.product = product;
    this.quantityPurchased = quantityPurchased;
  }

  public Product getProduct() {
    return this.product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public int getQuantityPurchased() {
    return this.quantityPurchased;
  }

  public void setQuantityPurchased(int quantityPurchased) {
    this.quantityPurchased = quantityPurchased;
  }
}
