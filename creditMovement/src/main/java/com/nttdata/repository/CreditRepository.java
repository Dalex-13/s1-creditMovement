package com.nttdata.repository;

import com.nttdata.entitys.CreditMovement;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends ReactiveCrudRepository<CreditMovement, String> {
}
