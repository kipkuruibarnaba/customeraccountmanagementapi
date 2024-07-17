package com.springboot.blog.service.impl;

import com.springboot.blog.model.User;
import com.springboot.blog.payload.CustomerDto;
import com.springboot.blog.payload.CustomerResponse;
import com.springboot.blog.repository.UserRepository;
import com.springboot.blog.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author BARNABA
 * @created 16/07/2024 - 7:39 PM
 * @project customeraccountmanagementapi
 */
@Service
public class CustomerImpl implements CustomerService {
    private UserRepository userRepository;
    private ModelMapper mapper;

    public CustomerImpl(UserRepository userRepository, ModelMapper mapper) {
        this.userRepository = userRepository;
        this.mapper = mapper;
    }

    @Override

//    public CustomerResponse getAllCustomers(int pageNo, int pageSize, String sortBy, String sortDir) {
//        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortBy).ascending()
//                : Sort.by(sortBy).descending();
//
//        // create Pageable instance
//        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
//
//        Page<User> users = userRepository.findAll(pageable);
//         System.out.println("Users "+users);
//        // get content for page object
//        List<User> listOfUsers = users.getContent();
//
//        List<CustomerDto> content= listOfUsers.stream().map(user -> mapToDTO(user)).collect(Collectors.toList());
//
//        CustomerResponse customerResponse = new CustomerResponse();
//        customerResponse.setContent(content);
//        customerResponse.setPageNo(users.getNumber());
//        customerResponse.setPageSize(users.getSize());
//        customerResponse.setTotalElements(users.getTotalElements());
//        customerResponse.setTotalPages(users.getTotalPages());
//        customerResponse.setLast(users.isLast());
//
//        return customerResponse;
//    }
    //    @Override
    public List<CustomerDto> getAllCustomers() {
        List<User> users = userRepository.findAll();
         return users.stream().map(user -> mapToDTO(user)).collect(Collectors.toList());
    }

    //Convert Entity into DTO
    private CustomerDto mapToDTO(User user){
        CustomerDto customerDto = mapper.map(user,CustomerDto.class);
//        AccountDto accountDto = new AccountDto();
//        accountDto.setId(account.getId());
//        accountDto.setIban(account.getIban());
//        accountDto.setClient_id(account.getClient_id());
//        accountDto.setBic_swift(account.getBic_swift());
        return customerDto;

    }

    //Convert DTO to  Entity
    private User mapToEntity(CustomerDto customerDto){
        User user = mapper.map(customerDto,User.class);
//        Account account = new Account();
//        account.setId(accountDto.getId());
//        account.setBic_swift(accountDto.getBic_swift());
//        account.setClient_id(accountDto.getClient_id());
//        account.setIban(accountDto.getIban());
        return user;
    }
}
