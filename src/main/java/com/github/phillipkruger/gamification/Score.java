package com.github.phillipkruger.gamification;

/**
 * Score of the person
 * @author Phillip Kruger (phillip.kruger@redhat.com)
 */
public class Score {

    private String name;
    private Long value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Score{" + "name=" + name + ", value=" + value + '}';
    }
}
