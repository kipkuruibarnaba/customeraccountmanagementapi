package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author BARNABA
 * @created 15/07/2024 - 8:16 PM
 * @project springboottransactionapi
 */
@Data
public class AccountDto {
    private long id;
    @NotEmpty(message = "Account NO is required")
    private String account_no;
    @NotEmpty(message = "Costomer ID is required")
    private  String customer_id;
    @NotEmpty(message = "Balance is required")
    private  String balance;
}
