package com.blogapp12.blogapp.controller;

import com.blogapp12.blogapp.payload.PostDto.ListPostDto;
import com.blogapp12.blogapp.payload.PostDto.PostDto;
import com.blogapp12.blogapp.service.PostService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private  PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }
    @PostMapping
public ResponseEntity<?> createPost(@Valid @RequestBody PostDto postdto, BindingResult bindingResult)
{
if(bindingResult.hasErrors())
{
 return new ResponseEntity<>(bindingResult.getFieldError().getDefaultMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
}
    PostDto dto = postService.createPost(postdto);
    return new ResponseEntity<>(dto, HttpStatus.CREATED);
}
@DeleteMapping("/{id}")
public ResponseEntity<String> deletePost(@PathVariable long id)
{
    postService.deletePost(id);

    return new ResponseEntity<>("post is deleted",HttpStatus.OK);
}

//http://localhost:8081/api/posts?pageno=0&pagesize=5
@GetMapping
public ResponseEntity<ListPostDto> fetchAllPosts(
        @RequestParam (name="pageno",defaultValue = "0",required = false)int pageno,
        @RequestParam(name = "pagesize",defaultValue = "5",required = false)int pagesize,
        @RequestParam(name ="sortBy",defaultValue = "",required = false) String sortBy,
        @RequestParam(name="sortDir",defaultValue  ="",required = false)String sortDir
)
{
   ListPostDto Postdtos= postService.fetchAllPosts(pageno,pagesize,sortBy,sortDir);
   return new ResponseEntity<>(Postdtos,HttpStatus.OK);
}

@GetMapping("/{id}")
    public ResponseEntity<PostDto> fetchPostWithId(@PathVariable long id)
{
    PostDto postDto=  postService.fetchWithPostId(id);
    return new ResponseEntity<>(postDto,HttpStatus.OK);
}
@PutMapping("/{id}")
    public ResponseEntity<PostDto> UpdatePosts(@PathVariable long id,@ RequestBody PostDto postDto)
{
    PostDto postDto1 = postService.UpdateWithId(id, postDto);
    return new ResponseEntity<>(postDto1,HttpStatus.CREATED);
}
}
