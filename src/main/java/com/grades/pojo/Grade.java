package com.grades.pojo;


import com.grades.validation.Score;

import javax.validation.constraints.NotBlank;


import java.util.UUID;

public class Grade {
    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Subject cannot be blank")
    private String course;

    @Score(message = "Score must be a number grade")
    private String score;

    private String id;

    public Grade(String name, String course, String score) {
        this.name = name;
        this.course = course;
        this.score = score;
        this.id =  UUID.randomUUID().toString() ;
    }

    public Grade() {
        this.id = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
