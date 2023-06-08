package com.project.models.repos;

import java.lang.Thread.State;
import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.models.entites.Blog;




    public interface BlogRepo extends CrudRepository<Blog, Long> {


        List<Blog> findByNameContains(String name);

    }
    

