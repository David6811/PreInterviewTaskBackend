package org.example;

import static com.google.common.truth.Truth.assertThat;

import java.util.List;
import org.example.entity.UsedCarSales;
import org.example.model.CarSearchParameters;
import org.example.repository.UsedCarSalesRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(
    classes = App.class,
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class MySQLTest {

  @Autowired
  private UsedCarSalesRepository usedCarSalesRepository;
  private static final String id = "1";

  @Test
  public void case_0_JPA_providedMake_shouldReturnCorrectUsedCarSales() {
    List<UsedCarSales> usedCarSales = usedCarSalesRepository.findByMake("Toyota");
    assertThat(id).isEqualTo(usedCarSales.get(0).getId());
  }

  @Test
  public void case_0_JPA_providedParameters_shouldReturnCorrectUsedCarSales() {
    CarSearchParameters carSearchParameters =new CarSearchParameters();
    carSearchParameters.setMaker("Audi");
    carSearchParameters.setModel("A5");
    List<UsedCarSales> usedCarSales = usedCarSalesRepository.findByParameter(carSearchParameters);
    assertThat(id).isEqualTo(usedCarSales.get(0).getId());
  }
}
