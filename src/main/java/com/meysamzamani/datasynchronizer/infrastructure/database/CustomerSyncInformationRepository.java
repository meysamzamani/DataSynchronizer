package com.meysamzamani.datasynchronizer.infrastructure.database;

import com.meysamzamani.datasynchronizer.domain.customer.CustomerSyncInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerSyncInformationRepository extends JpaRepository<CustomerSyncInformation, Long> {

    Optional<CustomerSyncInformation> findTopByOrderByIdAsc();

}
