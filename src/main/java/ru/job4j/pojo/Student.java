package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String id;
    private int group;
    private Date admission;

    public Student() {
    }

    public Student(String id, int group, Date admission) {
        this.id = id;
        this.group = group;
        this.admission = admission;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getAdmission() {
        return admission;
    }

    public void setAdmission(Date admission) {
        this.admission = admission;
    }
}
