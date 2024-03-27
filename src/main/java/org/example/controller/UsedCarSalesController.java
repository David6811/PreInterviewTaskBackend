package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsedCarSalesController {

  @GetMapping("/car")
  public String home() {
    return "car";
  }
}
