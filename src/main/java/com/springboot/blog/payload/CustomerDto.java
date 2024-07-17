package com.springboot.blog.payload;

import lombok.Data;

import java.util.Set;

/**
 * @author BARNABA
 * @created 16/07/2024 - 7:26 PM
 * @project customeraccountmanagementapi
 */
@Data
public class CustomerDto {
    private Long id;
    private String name;
    private String username;
    private String email;
//    private Set<AccountsDto> accounts;
}
