package com.project.models.repos;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;



import org.springframework.beans.factory.annotation.Autowired;
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


    

}
