package com.example.spring_web_flux_demo;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Tutorial {

    @Id
    private int id;

    private String title;

    private String description;

    private boolean published;

    public Tutorial() {

    }

    public Tutorial(String title, String description, boolean published) {
        this.title = title;
        this.description = description;
        this.published = published;
    }



    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}