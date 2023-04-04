package com.training.student.entity;

public class StudentEntity {
    private int id;
    String name;
    String branch;
    String place;

    public StudentEntity() {
    }

    public StudentEntity(int id, String name, String branch, String place) {
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.place = place;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
