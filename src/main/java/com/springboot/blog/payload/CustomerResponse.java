package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author BARNABA
 * @created 16/07/2024 - 7:28 PM
 * @project customeraccountmanagementapi
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerResponse {
//    private long id;
//    private String name;
//    private String username;
//    private String email;
//    private String password;
    private List<CustomerDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;
}
