package com.sayales.repository;

import com.sayales.domain.LengthUnitDomain;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LengthUnitDomainRepository extends CrudRepository<LengthUnitDomain, String> {
}
