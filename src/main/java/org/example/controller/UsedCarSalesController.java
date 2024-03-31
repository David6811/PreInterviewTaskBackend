package org.example.controller;

import java.util.List;
import org.example.entity.UsedCarSales;
import org.example.sevice.UsedCarSalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/car")
public class UsedCarSalesController {

  @Autowired
  public UsedCarSalesService usedCarSalesService;

  @GetMapping
  public List<UsedCarSales> getCars(
      @RequestParam(required = false) String maker,
      @RequestParam(required = false) String model,
      @RequestParam(required = false) String year) {

    System.out.println(maker);
    System.out.println(model);
    System.out.println(year);
    return usedCarSalesService.findByParameter(maker, model, null, null);
  }
}
