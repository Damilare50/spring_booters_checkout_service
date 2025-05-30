package com.spring_booters.checkout_service.service;

import com.spring_booters.checkout_service.dto.CheckoutProductItem;
import com.spring_booters.checkout_service.dto.CheckoutRequestDto;
import com.spring_booters.checkout_service.pojo.Invoice;
import com.spring_booters.checkout_service.pojo.InvoiceItem;
import com.spring_booters.checkout_service.pojo.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class IndexService {
  public String calculate(CheckoutRequestDto data) {
    ArrayList<CheckoutProductItem> productItems = data.getProducts();
    ArrayList<Product> products = new ArrayList<Product>();
    ArrayList<InvoiceItem> invoiceItems = new ArrayList<InvoiceItem>();
    Invoice invoice = new Invoice(data.getCustomerName(), data.getCashierName());

    for (CheckoutProductItem productItem : productItems) {
      Product product = new Product(productItem.getName(), productItem.getPrice());

      products.add(product);

      InvoiceItem invoiceItem = new InvoiceItem(product, productItem.getQuantity());

      invoiceItems.add(invoiceItem);

      invoice.incrementTotal(productItem.getPrice() * productItem.getQuantity());
    }
    return "";
  }
}
