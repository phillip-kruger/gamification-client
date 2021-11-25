package com.github.phillipkruger.gamification;

import java.util.List;

public class Person {
    private Long id;
    private String title;
    private List<String> names;
    private String surname;
    private List<Score> scores;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScore(List<Score> scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", title=" + title + ", names=" + names + ", surname=" + surname + ", scores=" + scores + '}';
    }
}
