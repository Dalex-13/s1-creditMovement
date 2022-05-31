package com.nttdata.controller;

import com.nttdata.entitys.CreditMovement;
import com.nttdata.service.CreditService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class CreditMovementController {

    private final CreditService service;

    @PostMapping("/add")
    public Mono<CreditMovement> registrar(@RequestBody CreditMovement creditMovement){
        log.info("creando movimiento de credito");
        return service.save(creditMovement);
    }

    @GetMapping("/listar")
    public Flux<CreditMovement> listAll(){
        log.info("listando movimiento de credito");
        return service.findAll();
    }


    @GetMapping("/listar/{id}")
    public Mono<CreditMovement> listById(@PathVariable String id){
        log.info("buscar movimiento de credito por ID");
        return service.findById(id);
    }

    @PutMapping("/actualizar/{id}")
    public Mono<CreditMovement> putById(@PathVariable String id, @RequestBody CreditMovement creditMovement){
        log.info("Actualizando movimiento de credito por Id");
        return service.updateById(id, creditMovement);
    }

    @DeleteMapping("/delete/{id}")
    public Mono<Void> deleteById(@PathVariable String id){
        log.info("Eliminando movimiento de credito por Id");
        return service.delete(id);
    }
}
