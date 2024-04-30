package com.blogapp12.blogapp.service.impl;

import com.blogapp12.blogapp.entity.Post;
import com.blogapp12.blogapp.exception.ResourceNotFound;
import com.blogapp12.blogapp.payload.PostDto.ListPostDto;
import com.blogapp12.blogapp.payload.PostDto.PostDto;
import com.blogapp12.blogapp.repository.PostRepository;
import com.blogapp12.blogapp.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;


    private ModelMapper modelMapper;
    public PostServiceImpl(PostRepository postRepository,ModelMapper modelMapper) {
        this.postRepository = postRepository;
        this.modelMapper = modelMapper;
    }
    @Override
    public PostDto createPost(PostDto postDto) {
        
        Post post=mapToEntity(postDto);
        Post savedPost =postRepository.save(post);

//        post.setId(postDto.getId());
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
//        Post savedPost = postRepository.save(post);

        PostDto dto=mapToDto(savedPost);


//        PostDto dto=new PostDto();
//        dto.setId(savedPost.getId());
//        dto.setTitle(savedPost.getTitle());
//        dto.setDescription(postDto.getDescription());
//        dto.setContent(postDto.getContent());


        return dto;
    }


    Post  mapToEntity(PostDto postDto)//for Reusable
  {

      Post post= modelMapper.map(postDto,Post.class);

      return post;
  }

  PostDto mapToDto(Post post)
  {
//      PostDto dto=new PostDto();
//      dto.setId(post.getId());
//      dto.setTitle(post.getTitle());
//      dto.setDescription(post.getDescription());
//      dto.setContent(post.getContent());

     PostDto dto= modelMapper.map(post,PostDto.class);
      return dto;
  }


    @Override
    public void deletePost(long id) {
        postRepository.deleteById(id);
    }

    @Override
    public ListPostDto fetchAllPosts(int pageno, int pagesize, String sortBy, String sortDir) {
        Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())?Sort.by(sortBy).ascending():Sort.by(sortBy).descending();
        Pageable pageable=PageRequest.of(pageno,pagesize, sort);
        Page<Post> all= postRepository.findAll(pageable);
        List<Post> post=all.getContent();
        List<PostDto> Postdtos= post.stream().map(e->mapToDto(e)).collect(Collectors.toList());

        ListPostDto listPostDto=new ListPostDto();
        listPostDto.setPostDto(Postdtos);
        listPostDto.setTotalPages(all.getTotalPages());
        listPostDto.setTotalElement((int) all.getTotalElements());
        listPostDto.setFirstPage(all.isFirst());
        listPostDto.setLastPage(all.isLast());
        listPostDto.setPageNumber(all.getNumber());
        return listPostDto;
    }

    @Override
    public PostDto fetchWithPostId(long id) {
        Post post=postRepository.findById(id).orElseThrow(
                ()->new ResourceNotFound("Post not found with id:"+id));
        return mapToDto(post);
    }

    @Override
    public PostDto UpdateWithId(long id,PostDto postDto) {
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFound("post not found with id:" + id));
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        post.setDescription(postDto.getDescription());
        Post save = postRepository.save(post);
        PostDto dto = mapToDto(save);
        return  dto;
    }
}
