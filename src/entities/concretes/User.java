package entities.concretes;

import entities.abstracts.Entity;

public class User implements Entity {

    private int id;
    private String fistName;
    private String lastName;
    private String email;
    private int password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public User(int id, String fistName, String lastName, String email, int password) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


}
