package com.springboot.blog.service.impl;

import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.model.Account;
import com.springboot.blog.model.Transaction;
import com.springboot.blog.model.User;
import com.springboot.blog.payload.TransactionDto;
import com.springboot.blog.repository.AccountRepository;
import com.springboot.blog.repository.TransactionRepository;
import com.springboot.blog.repository.UserRepository;
import com.springboot.blog.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author BARNABA
 * @created 16/07/2024 - 9:23 AM
 * @project springboottransactionapi
 */
@Service
public class TransactionServiceImpl implements TransactionService {
    private UserRepository userRepository;
    private TransactionRepository transactionRepository;
    private AccountRepository accountRepository;

    public TransactionServiceImpl(UserRepository userRepository, TransactionRepository transactionRepository, AccountRepository accountRepository) {
        this.userRepository = userRepository;
        this.transactionRepository = transactionRepository;
        this.accountRepository = accountRepository;
    }

    @Override
    public TransactionDto createTransaction(long customerId, TransactionDto transactionDto) {

        Transaction transaction = mapToEntity(transactionDto);
        //Retrieve user entity by id
        User user = userRepository.findById(customerId).orElseThrow(
                ()->new ResourceNotFoundException("Customer", "id", customerId));

//        Account account = accountRepository.findByAccountNo(transactionDto.getAccount()).orElseThrow(
//                () -> new ResourceNotFoundException("Customer", "id", Integer.parseInt(transactionDto.getAccount())));

        //Get Customer and account details
//        Account accountno = accountRepository.findByAccountNo("2").orElseThrow(
//                ()->new ResourceNotFoundException("Account", "",Integer.parseInt(transactionDto.getAccount())));

//        List<Account> acc = accountRepository.findByAccountNo(transaction.getAccount());
//        System.out.println("Account ID is " +acc);
//        System.out.println("Customer ID is " +customerId);

        //set customer to transaction
        transaction.setUser(user);
        //Save transaction entity to the database
        Transaction newTransaction= transactionRepository.save(transaction);
        return mapToDTO(newTransaction);
//        return null;
    }

//    @Override
//    public List<TransactionDto> gettransactionsByCustomerId(long customerId) {
//        return null;
//    }
//
//    @Override
//    public List<TransactionDto> gettransactionsByAccountNo(long customerId) {
//        return null;
//    }
//
//    @Override
//    public TransactionDto getTransactionById(Long customerId, Long accountId) {
//        return null;
//    }
//
//    @Override
//    public CommentDto updateComment(Long postId, Long commentId, CommentDto commentRequest) {
//        return null;
//    }
//
//    @Override
//    public void deleteComment(Long postId, Long commentId) {
//
//    }

    //Convert Entity into DTO
    private TransactionDto mapToDTO(Transaction transaction){
        TransactionDto transactionDto = new TransactionDto();
        transactionDto.setId(transaction.getId());
        transactionDto.setType(transaction.getType());
        transactionDto.setAmount(transaction.getAmount());
        transactionDto.setAccount(transaction.getAccount());
        return  transactionDto;
    }

    //Convert DTO to  Entity
    private Transaction mapToEntity(TransactionDto transactionDto){
        Transaction transaction = new Transaction();
        transaction.setId(transactionDto.getId());
        transaction.setAccount(transactionDto.getAccount());
        transaction.setAmount(transactionDto.getAmount());
        transaction.setType(transactionDto.getType());
        return transaction;
    }
}
