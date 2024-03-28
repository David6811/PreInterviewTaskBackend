package org.example.repository;

import org.example.entity.UsedCarSales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsedCarSalesRepository extends JpaRepository<UsedCarSales, Long> {
  UsedCarSales findByMake(String make);
}
