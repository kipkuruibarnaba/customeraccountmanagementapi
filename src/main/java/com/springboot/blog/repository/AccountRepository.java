package com.springboot.blog.repository;

import com.springboot.blog.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @author BARNABA
 * @created 15/07/2024 - 8:10 PM
 * @project springboottransactionapi
 */
public interface AccountRepository extends JpaRepository<Account,Long> {
//    List<Account> findByUserId(long userId);
Optional<Account> findByUserId(long userId);
//    Optional<Account> findByAccount(String customerId);
//    Optional<User> findByCustomerID(String userid);
//    Account findByAccountNo(String account);
//        List<Account> findByAccountNo(String account_no);

//        @Query(value = "SELECT * FROM account a WHERE a.account_no=:query", nativeQuery = true)
//        List<Account> findByAccountNo(String account);

}
