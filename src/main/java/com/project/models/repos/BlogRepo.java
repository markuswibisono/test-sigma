package com.project.models.repos;


import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.project.models.entites.Blog;




    public interface BlogRepo extends PagingAndSortingRepository<Blog, Long> {


        List<Blog> findByNameContains(String name);


        List<Blog> findByNameContains(String name, org.springframework.data.domain.Pageable pageable);

    }
    

