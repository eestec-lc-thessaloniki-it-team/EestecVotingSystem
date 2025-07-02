package com.eestecVotingSystem.votingsystem.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity  // This is for SpringBoot to see each object as a row in the DB
@Table(name = "users")
@Getter // Setter and Getter BoilerPlate are handled by Lombok and the
@Setter
@NoArgsConstructor //Like public User() {} That's why we don't have a constructor (Inserts NULL Values)
@AllArgsConstructor // Generates a constructor with all fields as parameters
@Builder // This makes the instantiation more readable

//@AllArgsConstructor:
//Use the constructor with the ID only when:
//
//You're rebuilding an object from the database (e.g., testing or manual mapping),
//
//Or you're doing an update, and you already know the ID.

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String Name;
    @NotBlank(message = "Surname is required")
    private String Surname;
    @NotBlank(message = "Email is required")
    private String Email;

    public User(String name, String surname, String email) {
        this.Name = name;
        this.Surname = surname;
        this.Email = email;
    }


//    @Enumerated(EnumType.STRING)
//    private UserRole role;
}
