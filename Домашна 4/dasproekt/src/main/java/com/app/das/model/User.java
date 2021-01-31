package com.app.das.model;
import javax.persistence.*;
@Entity
@Table(name = "users")
/*Na sekoj korisnik mu generira username i password.
Idejata e tuka ova da se iskoristi za delot registracija/najava na daden korisnik.*/
public class User {
    @Id
    private String username;
    private String password;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}