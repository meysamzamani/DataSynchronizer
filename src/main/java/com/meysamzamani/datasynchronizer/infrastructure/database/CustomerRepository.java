package com.meysamzamani.datasynchronizer.infrastructure.database;

import com.meysamzamani.datasynchronizer.domain.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByKundenIdGreaterThan(Long id);

}
