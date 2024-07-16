package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

/**
 * @author BARNABA
 * @created 15/07/2024 - 9:27 PM
 * @project springboottransactionapi
 */
@Data
public class TransactionDto {
    private long id;
    @NotEmpty
    private String account;
    @NotEmpty
    private  String amount;
    @NotEmpty
    private  String type;
}
