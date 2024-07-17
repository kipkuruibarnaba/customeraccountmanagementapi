package com.springboot.blog.controller;

import com.springboot.blog.payload.CustomerDto;
import com.springboot.blog.payload.CustomerResponse;
import com.springboot.blog.payload.TransactionDto;
import com.springboot.blog.service.CustomerService;
import com.springboot.blog.service.TransactionService;
import com.springboot.blog.utils.AppConstants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author BARNABA
 * @created 15/07/2024 - 9:29 PM
 * @project springboottransactionapi
 */
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/")
public class TransactionController {
    private TransactionService transactionService;
    private CustomerService customerService;

    public TransactionController(TransactionService transactionService, CustomerService customerService) {
        this.transactionService = transactionService;
        this.customerService = customerService;
    }

    @PostMapping("/customers/{customerId}/transactions")
    public ResponseEntity<TransactionDto> createTransaction(@PathVariable(value = "customerId") long customerId, @Valid @RequestBody TransactionDto transactionDto){
        return new ResponseEntity<>(transactionService.createTransaction(customerId,transactionDto), HttpStatus.CREATED);
    }
    //Get all posts rest api
    @GetMapping("/customers")
    public List<CustomerDto> getAllPosts(

    ){
        return  customerService.getAllCustomers();
    }
//    public CustomerResponse getAllPosts(
////    public List<PostDto> getAllPosts(
//            @RequestParam(value = "pageNo",defaultValue = AppConstants.DEFAULT_PAGE_NO,required = false) int pageNo,
//            @RequestParam(value = "pageSize",defaultValue = AppConstants.DEFAULT_PAGE_SIZE,required = false) int pageSize,
//            @RequestParam(value = "sortBy",defaultValue = AppConstants.DEFAULT_SORT_BY,required = false) String sortBy,
//            @RequestParam(value = "sortDir",defaultValue = AppConstants.DEFAULT_SORT_DIRECTION,required = false) String sortDir
//    ){
//        return  customerService.getAllCustomers(pageNo,pageSize,sortBy,sortDir);
//    }
//    @GetMapping("/posts/{postId}/comments")
//    public List<CommentDto> getCommentsByPostId(@PathVariable(value = "postId") Long postId){
//        return commentService.getCommentsByPostId(postId);
//    }
//    @GetMapping("/posts/{postId}/comments/{id}")
//    public ResponseEntity<CommentDto> getCommentById(@PathVariable(value = "postId") Long postId,
//                                                     @PathVariable(value = "id") Long commentId) {
//        CommentDto commentDto = commentService.getCommentById(postId,commentId);
//        return new ResponseEntity<>(commentDto, HttpStatus.OK);
//    }
//    @PutMapping("/posts/{postId}/comments/{commentId}")
//    public ResponseEntity<CommentDto> updateComment(@PathVariable(value = "postId") Long postId,
//                                                    @PathVariable(value = "commentId") Long commentId,
//                                                    @Valid  @RequestBody CommentDto reqcommentDto){
//        CommentDto updatedComment = commentService.updateComment(postId,commentId,reqcommentDto);
//        return new ResponseEntity<>(updatedComment,HttpStatus.OK);
//
//    }
//    @DeleteMapping("/posts/{postId}/comments/{commentId}")
//    public  ResponseEntity<String> deleteComment(@PathVariable(value = "postId") Long postId,
//                                                 @PathVariable(value = "commentId") Long commentId){
//        commentService.deleteComment(postId,commentId);
//        return  new ResponseEntity<>("Comment deleted successfully",HttpStatus.OK);
//    }

}
