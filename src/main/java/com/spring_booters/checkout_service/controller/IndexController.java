package com.spring_booters.checkout_service.controller;

import com.spring_booters.checkout_service.dto.CheckoutRequestDto;
import com.spring_booters.checkout_service.pojo.Invoice;
import com.spring_booters.checkout_service.service.IndexService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IndexController {
  private final IndexService indexService;

  @Autowired
  public IndexController(IndexService indexService) {
    this.indexService = indexService;
  }

  @PostMapping("/checkout")
  public ResponseEntity<Invoice> checkout(@Valid @RequestBody CheckoutRequestDto data) {
    Invoice response = this.indexService.calculate(data);

    return ResponseEntity.ok(response);
  }
}
