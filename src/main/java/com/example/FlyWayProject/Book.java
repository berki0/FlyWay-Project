package com.example.FlyWayProject;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.List;

@Entity
@Data
@Table(name="books")
public class Book {
    @Id
    private Integer id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "book")
    private List<User> users;
}
