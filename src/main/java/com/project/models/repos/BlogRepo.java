package com.project.models.repos;

import java.util.List;

import javax.websocket.server.PathParam;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.project.models.entites.Blog;




    public interface BlogRepo extends CrudRepository<Blog, Long> {

        //versi default jpa
        List<Blog> findByNameContains(String name);

        //custom query sql jpa
        /*@Query("SELECT p FROM tbl_product p WHERE p.product_name = :name")
        public Product findProductByName(@PathParam("name")  String name);*/

        

    }
    

