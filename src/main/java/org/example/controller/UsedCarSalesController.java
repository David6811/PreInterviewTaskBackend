package org.example.controller;

import org.example.model.CarSearchParameters;
import org.example.model.Response;
import org.example.model.ResponseMessage;
import org.example.model.ResponseStatus;
import org.example.sevice.UsedCarSalesService;
import org.example.util.CarSearchParametersUtil;
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
  public Response getCars(
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

    try {
      CarSearchParameters carSearchParameters = CarSearchParametersUtil.AssembleCarSearchParameters(maker, model, year,
          odometer, vehicleCondition, states, customDate, saleCategory,
          badges, bodyType, bodyTypeConfig, fuelType, transmission, engine, cylinders, division,
          drive, seat, doors, description, sort, asc);

      System.out.println(carSearchParameters);

      return new Response(ResponseStatus.SUCCESS, ResponseMessage.SUCCESS,
          usedCarSalesService.findByParameter(carSearchParameters));
    } catch (Exception e) {
      e.printStackTrace();
      return new Response(ResponseStatus.FAIL, ResponseMessage.ERROR, null);
    }

  }
}
