package com.sayales.repository;

import com.sayales.domain.SpeedUnitDomain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeedUnitDomainRepository extends CrudRepository<SpeedUnitDomain, String> {
}
