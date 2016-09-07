package com.objectpartners.quotes.entity;

import javax.persistence.*;

/**
 * Created by mikeh on 9/1/16.
 */
@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long  id;

    private String text;

    @ManyToOne
    @JoinColumn(name="author_id")
    private Author author;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
