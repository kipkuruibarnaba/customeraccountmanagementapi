package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

/**
 * @author BARNABA
 * @created 15/07/2024 - 8:15 PM
 * @project springboottransactionapi
 */
public interface AccountService {
    CommentDto createComment(long postId, CommentDto commentDto);
}
