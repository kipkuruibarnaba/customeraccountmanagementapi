package com.springboot.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author BARNABA
 * @created 15/07/2024 - 8:03 PM
 * @project springboottransactionapi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(
        name = "account"
)
public class Account {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private long id;
    private String account_no;
    private  String balance;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id",nullable = false)
    private User user;
}
