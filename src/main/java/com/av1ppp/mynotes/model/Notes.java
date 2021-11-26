package com.av1ppp.mynotes.model;

import javax.persistence.*;

@Entity
@Table(name="notes")
public class Notes {
    @Id
    private String id;

    private String title;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
