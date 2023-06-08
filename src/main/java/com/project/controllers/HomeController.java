
package com.project.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.models.entites.Blog;
import com.project.models.entites.ResponseDelete;
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


    @GetMapping("/{id}")
    public Blog findOne(@PathVariable("id") Long id) {
        return blogService.findOne(id);
    }



    @PutMapping
    public Blog update(@RequestBody Blog blog) {
        return blogService.save(blog);
    }
   

    
    @DeleteMapping("/{id}")

    public ResponseDelete removeOne(@PathVariable("id") Long id){
         
        blogService.removeOne(id);
        
        ResponseDelete responsedata = new ResponseDelete();

        responsedata.setId(id);


        return responsedata;

    }

 
    
}