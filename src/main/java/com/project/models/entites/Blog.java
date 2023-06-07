package com.project.models.entites;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_blog")
@NoArgsConstructor
@SuppressWarnings("serial")

public class Blog {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="name_blog", length = 30)
    private String name;

    @Column(columnDefinition = "TEXT", name="body_blog", length = 200)
    private String body_blog;

    @Column(name="author", length = 200)
    private String author;

	
	public Blog(Long id, String name, String body_blog, String author) {
		this.id = id;
		this.name = name;
        this.body_blog=body_blog;
        this.author=author;
	}
	

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBody_blog() {
        return body_blog;
    }

    public void setBody_blog(String body_blog) {
        this.body_blog = body_blog;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
