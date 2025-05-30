package com.spring_booters.checkout_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.annotation.Validated;

@SpringBootApplication
@Validated
public class CheckoutServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(CheckoutServiceApplication.class, args);
  }

}
