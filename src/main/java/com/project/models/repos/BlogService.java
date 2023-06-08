package com.project.models.repos;

import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.project.models.entites.Blog;





@Service
@Transactional
public class BlogService {
    
    @Autowired
    private BlogRepo blogRepo;

 

    public Blog save(Blog blogs) {
        return blogRepo.save(blogs);
    }

    public Iterable <Blog> findAll() {
        return blogRepo.findAll();
    }

    public Blog findOne(Long id) {

      return blogRepo.findById(id).get();
        
    }

    public void removeOne(Long id) {
      blogRepo.deleteById(id);
  }
 
}
