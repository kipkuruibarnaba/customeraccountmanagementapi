package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.payload.CustomerDto;
import com.springboot.blog.payload.CustomerResponse;

import java.util.List;

/**
 * @author BARNABA
 * @created 16/07/2024 - 7:38 PM
 * @project customeraccountmanagementapi
 */
public interface CustomerService {
//    CustomerResponse getAllCustomers(int pageNo, int pageSize, String sortBy, String sortDir);

    List<CustomerDto> getAllCustomers();
}
