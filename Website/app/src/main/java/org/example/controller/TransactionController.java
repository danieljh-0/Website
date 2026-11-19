package org.example.controller;

import org.example.repository.TransactionRepository;
import org.springframework.web.bind.annotation.*;
import org.example.entity.transaction;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

    private final TransactionRepository repository;


    public TransactionController(TransactionRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public transaction saveTransaction(@RequestBody transaction trans) {
        return repository.save(trans);
    }

    @GetMapping
    public List<transaction> getAllAuthors() {
        return repository.findAll();
    }

}
