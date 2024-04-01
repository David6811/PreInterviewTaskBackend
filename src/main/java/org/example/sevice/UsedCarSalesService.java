package org.example.sevice;

import org.example.entity.UsedCarSales;
import org.example.model.CarSearchParameters;
import org.example.repository.UsedCarSalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsedCarSalesService{

  @Autowired
  private UsedCarSalesRepository usedCarSalesRepository;

  public List<UsedCarSales> findByParameter(CarSearchParameters carSearchParameters) {
    return usedCarSalesRepository.findByParameter(carSearchParameters);
  }
}
