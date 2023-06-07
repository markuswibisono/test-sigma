
package com.project.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.entites.Blog;
import com.project.models.entites.ResponseInsert;
import com.project.models.repos.BlogService;


@RestController
@RequestMapping("/api/blogs")
public class HomeController {

    @Autowired
    private BlogService blogService;


    @PostMapping
    public ResponseInsert create(@RequestBody Blog blog) {


        blogService.save(blog);

        ResponseInsert responsedata = new ResponseInsert();

        responsedata.setId(blog.getId());


        return responsedata;
        
    }

      
    @GetMapping
    public Iterable<Blog> findAll() {
        return blogService.findAll();
    }


}