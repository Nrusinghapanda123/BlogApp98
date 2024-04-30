package com.blogapp12.blogapp.payload.PostDto;

import lombok.Data;

import java.util.List;
@Data
public class ListPostDto {

    private List<PostDto> postDto;
    private int totalPages;
    private  int totalElement;
    private boolean lastPage;
    private  boolean firstPage;

    private  int pageNumber;

}
