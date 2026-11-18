package org.example.repository;

import org.example.entity.transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<transaction, Integer> {


}
