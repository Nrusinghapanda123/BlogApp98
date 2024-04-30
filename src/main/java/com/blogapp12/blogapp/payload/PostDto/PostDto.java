package com.blogapp12.blogapp.payload.PostDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
public class PostDto {

    private int id;
    @NotEmpty
    @Size(min = 3,message = "title should be atleast 3 characters")
    private String title;
    @NotEmpty
    private String description;
    private String content;



}
