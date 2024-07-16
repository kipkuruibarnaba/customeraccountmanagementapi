package com.springboot.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author BARNABA
 * @created 15/07/2024 - 9:26 PM
 * @project springboottransactionapi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "transactions"
)
public class Transaction {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;
    private String account;
    private  String type;
    private  String amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",nullable = false)
    private User user;
}
