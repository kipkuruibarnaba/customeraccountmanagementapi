package com.springboot.blog.controller;

import com.springboot.blog.payload.CommentDto;
import com.springboot.blog.payload.TransactionDto;
import com.springboot.blog.service.CommentService;
import com.springboot.blog.service.TransactionService;
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
@RequestMapping("/api/")
public class TransactionController {
    private TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/customers/{customerId}/transactions")
    public ResponseEntity<TransactionDto> createTransaction(@PathVariable(value = "customerId") long customerId, @Valid @RequestBody TransactionDto transactionDto){
        return new ResponseEntity<>(transactionService.createTransaction(customerId,transactionDto), HttpStatus.CREATED);
    }
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
