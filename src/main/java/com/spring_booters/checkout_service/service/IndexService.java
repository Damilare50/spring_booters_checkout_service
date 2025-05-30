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
  public Invoice calculate(CheckoutRequestDto data) {
    ArrayList<CheckoutProductItem> productItems = data.getProducts();
    ArrayList<InvoiceItem> invoiceItems = new ArrayList<InvoiceItem>();
    Invoice invoice = new Invoice(data.getCustomerName(), data.getCashierName());

    for (CheckoutProductItem productItem : productItems) {
      Product product = new Product(productItem.getName(), productItem.getPrice());

      InvoiceItem invoiceItem = new InvoiceItem(product, productItem.getQuantity());
      invoiceItems.add(invoiceItem);

      invoice.incrementTotal(productItem.getPrice() * productItem.getQuantity());
    }

    invoice.setItems(invoiceItems);
    invoice.setDiscount(data.getDiscount());

    if (invoice.getDiscount() > 0) {
      invoice.setNetTotal(invoice.getTotal() * (invoice.getDiscount() / 100));
    }

    return invoice;
  }
}
