package com.example.messagestreamerproject.dto;

public class User {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstN() {
        return firstN;
    }

    public void setFirstN(String firstN) {
        this.firstN = firstN;
    }

    public String getLastN() {
        return lastN;
    }

    public void setLastN(String lastN) {
        this.lastN = lastN;
    }

    private int id;
    private String firstN;

    private String lastN;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstN='" + firstN + '\'' +
                ", lastN='" + lastN + '\'' +
                '}';
    }
}
