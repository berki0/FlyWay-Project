package com.example.FlyWayProject;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private int age;
    private LocalDateTime crated_at;
    @ManyToOne
    @JoinColumn(name = "book_id", referencedColumnName = "id")
    private Book book;


}
