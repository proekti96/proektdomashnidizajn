package com.app.das.model;
import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "gradovi")
public class Grad{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "grad")
    List<Location> locations;
    public Grad() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Location> getLocations() {
        return locations;
    }
}