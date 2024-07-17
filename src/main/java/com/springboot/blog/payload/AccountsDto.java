package com.springboot.blog.payload;

import lombok.Data;

/**
 * @author BARNABA
 * @created 16/07/2024 - 8:16 PM
 * @project customeraccountmanagementapi
 */
@Data
public class AccountsDto {
    private long id;
    private String account_no;
    private String balance;
    private String customer_id;
}
