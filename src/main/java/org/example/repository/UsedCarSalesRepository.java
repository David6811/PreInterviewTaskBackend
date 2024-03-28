package org.example.repository;

import java.util.List;
import javax.persistence.criteria.Predicate;
import org.example.entity.UsedCarSales;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor; // Import added
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

@Repository
public interface UsedCarSalesRepository extends JpaRepository<UsedCarSales, Long>,
    JpaSpecificationExecutor<UsedCarSales> { // Added JpaSpecificationExecutor

  List<UsedCarSales> findByMake(String make);

  default List<UsedCarSales> findByParameter(String make, String model, Integer year, Integer odometer) {
    return findAll((Specification<UsedCarSales>) (root, query, criteriaBuilder) -> {
      Predicate predicate = criteriaBuilder.conjunction();

      if (!StringUtils.isEmpty(make)) {
        predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("make"), make));
      }

      if (!StringUtils.isEmpty(model)) {
        predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("model"), model));
      }

      if (year != null) {
        predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("year"), year));
      }

      if (odometer != null) {
        predicate = criteriaBuilder.and(predicate, criteriaBuilder.equal(root.get("odometer"), odometer));
      }

      return predicate;
    });
  }
}

