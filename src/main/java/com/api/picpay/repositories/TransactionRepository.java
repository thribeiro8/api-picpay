package com.api.picpay.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.picpay.domain.transaction.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
