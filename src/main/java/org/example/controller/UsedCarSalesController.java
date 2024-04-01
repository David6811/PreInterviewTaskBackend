package org.example.controller;

import java.util.List;
import org.example.entity.UsedCarSales;
import org.example.model.CarSearchParameters;
import org.example.sevice.UsedCarSalesService;
import org.example.util.CarSearchParametersUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.StreamingHttpOutputMessage.Body;
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
      @RequestParam(required = false) String year,
      @RequestParam(required = false) String odometer,
      @RequestParam(required = false) String vehicleCondition,
      @RequestParam(required = false) String states,
      @RequestParam(required = false) String customDate,
      @RequestParam(required = false) String saleCategory,
      @RequestParam(required = false) String badges,
      @RequestParam(required = false) String bodyType,
      @RequestParam(required = false) String bodyTypeConfig,
      @RequestParam(required = false) String fuelType,
      @RequestParam(required = false) String transmission,
      @RequestParam(required = false) String engine,
      @RequestParam(required = false) String cylinders,
      @RequestParam(required = false) String division,
      @RequestParam(required = false) String drive,
      @RequestParam(required = false) String seat,
      @RequestParam(required = false) String doors,
      @RequestParam(required = false) String description,
      @RequestParam(required = false) String sort,
      @RequestParam(required = false) String asc) {

    System.out.println("Maker: " + maker);
    System.out.println("Model: " + model);
    System.out.println("Year: " + year);
    System.out.println("Odometer: " + odometer);
    System.out.println("Vehicle Condition: " + vehicleCondition);
    System.out.println("States: " + states);
    System.out.println("Custom Date: " + customDate);
    System.out.println("Sale Category: " + saleCategory);
    System.out.println("Badges: " + badges);
    System.out.println("Body Type: " + bodyType);
    System.out.println("Body Type Config: " + bodyTypeConfig);
    System.out.println("Fuel Type: " + fuelType);
    System.out.println("Transmission: " + transmission);
    System.out.println("Engine: " + engine);
    System.out.println("Cylinders: " + cylinders);
    System.out.println("Division: " + division);
    System.out.println("Drive: " + drive);
    System.out.println("Seat: " + seat);
    System.out.println("Doors: " + doors);
    System.out.println("Description: " + description);
    System.out.println("Sort: " + sort);
    System.out.println("Ascending: " + asc);

    CarSearchParameters carSearchParameters = CarSearchParametersUtil.AssembleCarSearchParameters(maker, model, year, odometer, vehicleCondition, states, customDate, saleCategory,
        badges, bodyType, bodyTypeConfig, fuelType, transmission, engine, cylinders, division,
        drive, seat, doors, description, sort, asc);

    System.out.println(carSearchParameters);

    return usedCarSalesService.findByParameter(carSearchParameters);
  }
}
