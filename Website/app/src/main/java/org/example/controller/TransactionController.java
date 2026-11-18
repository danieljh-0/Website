package org.example.controller;

import org.example.repository.TransactionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.example.entity.transaction;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TransactionController {

    private final TransactionRepository repository;


    public TransactionController(TransactionRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public transaction saveTransaction(@RequestBody transaction trans) {
        return repository.save(trans);
    }

}
