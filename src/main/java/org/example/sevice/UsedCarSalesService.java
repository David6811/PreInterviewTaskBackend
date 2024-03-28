package org.example.sevice;

import org.example.entity.UsedCarSales;
import org.example.repository.UsedCarSalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsedCarSalesService {

  @Autowired
  private UsedCarSalesRepository usedCarSalesRepository;

  public List<UsedCarSales> findByParameter(String make, String model, Integer year, Integer odometer) {
    return usedCarSalesRepository.findByParameter(make, model, year, odometer);
  }
}
