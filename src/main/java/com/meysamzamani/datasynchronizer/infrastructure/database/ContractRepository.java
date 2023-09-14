package com.meysamzamani.datasynchronizer.infrastructure.database;

import com.meysamzamani.datasynchronizer.domain.contract.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, String> {

}