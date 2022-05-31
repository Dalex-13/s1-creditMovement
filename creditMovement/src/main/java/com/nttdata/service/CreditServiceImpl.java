package com.nttdata.service;

import com.nttdata.entitys.CreditMovement;
import com.nttdata.repository.CreditRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CreditServiceImpl implements CreditService{

    private final CreditRepository repository;

    @Override
    public Flux<CreditMovement> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<CreditMovement> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Mono<CreditMovement> save(CreditMovement creditMovement) {
        return repository.save(creditMovement);
    }

    @Override
    public Mono<CreditMovement> updateById(String id, CreditMovement creditMovement) {
        return this.findById(id)
                .flatMap(entity -> this.save(creditMovement))
                .switchIfEmpty( Mono.error(new Exception()));
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }
}
