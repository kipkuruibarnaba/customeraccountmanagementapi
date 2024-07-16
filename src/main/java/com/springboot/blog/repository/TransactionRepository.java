package com.springboot.blog.repository;

import com.springboot.blog.model.Comment;
import com.springboot.blog.model.Transaction;
import com.springboot.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author BARNABA
 * @created 16/07/2024 - 9:39 AM
 * @project springboottransactionapi
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long > {
//    List<Transaction> findByCustomerId(long customerId);
}
