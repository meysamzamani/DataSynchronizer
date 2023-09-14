package com.meysamzamani.datasynchronizer.infrastructure.database;

import com.meysamzamani.datasynchronizer.domain.shared.Dummy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository<Dummy, Long> {

}
