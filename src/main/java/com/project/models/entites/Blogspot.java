package com.project.models.entites;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.websocket.Decoder.Text;

@Entity
@Table(name = "tbl_blogspot")

public class Blogspot implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idblogspot;

    @Column(name="title", length = 30)
    private String title;


    @Column(columnDefinition = "TEXT", name="body")
    private String body;

    @Column(name="author", length = 30)
    private String author;

    public Blogspot() {

    }

    public Blogspot(Long idblogspot, String title, String body, String author) {
        this.idblogspot = idblogspot;
        this.title = title;
        this.body = body;
        this.author = author;
    }


    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getIdblogspot() {
        return idblogspot;
    }

    public void setIdblogspot(Long idblogspot) {
        this.idblogspot = idblogspot;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   


    

}
