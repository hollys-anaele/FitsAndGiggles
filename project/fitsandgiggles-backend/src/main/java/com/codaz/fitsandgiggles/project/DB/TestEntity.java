package com.codaz.fitsandgiggles.project.DB;
import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "sss")
public class TestEntity {
    @Id
    private Integer id;

    private Date created_at;
    private String username;

    // getters and setters

    
    // Getters
    public Integer getId() {
        return id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public String getUsername() {
        return username;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
