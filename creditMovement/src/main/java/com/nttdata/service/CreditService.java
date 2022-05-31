package com.nttdata.service;

import com.nttdata.entitys.CreditMovement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditService {

    public Flux<CreditMovement> findAll();

    public Mono<CreditMovement> findById(String id);

    public Mono<CreditMovement> save(CreditMovement creditMovement);

    public Mono<CreditMovement> updateById(String id, CreditMovement creditMovement);

    public Mono<Void> delete(String id);
}
