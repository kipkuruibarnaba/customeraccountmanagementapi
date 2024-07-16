package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.payload.TransactionDto;

import java.util.List;

/**
 * @author BARNABA
 * @created 15/07/2024 - 9:31 PM
 * @project springboottransactionapi
 */
public interface TransactionService {
    TransactionDto createTransaction(long customerId, TransactionDto transactionDto);
//    List<TransactionDto> gettransactionsByCustomerId(long customerId);
//
//    List<TransactionDto> gettransactionsByAccountNo(long customerId);
//
//    TransactionDto getTransactionById(Long customerId, Long accountId);
//
//    CommentDto updateComment(Long postId, Long commentId, CommentDto commentRequest);
//    void deleteComment(Long postId, Long commentId);
}
