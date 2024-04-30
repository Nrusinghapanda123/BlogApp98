package com.blogapp12.blogapp.service;

import com.blogapp12.blogapp.payload.PostDto.ListPostDto;
import com.blogapp12.blogapp.payload.PostDto.PostDto;

public interface PostService {

    public PostDto createPost(PostDto postDto);

    void deletePost(long id);

    ListPostDto fetchAllPosts(int pageno, int pagesize, String sortBy, String sortDir);


    PostDto fetchWithPostId(long id);

    PostDto UpdateWithId(long id,PostDto postDto );


}
