package com.eestecVotingSystem.votingsystem.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;

@Slf4j
@Entity  // This is for SpringBoot to see each object as a row in the DB
@Table(name = "users")
@Getter // Setter and Getter BoilerPlate are handled by Lombok and the
@Setter
@NoArgsConstructor //Like public User() {} That's why we don't have a constructor (Inserts NULL Values)
@AllArgsConstructor // Generates a constructor with all fields as parameters
@Builder // This makes the instantiation more readable

public class Election  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String voteTitle;

    private String vote;

    @ElementCollection
    private HashMap<String, Integer> choices = new HashMap<>();
    // This initializes any HashMap object with that code
    {
        choices.put("In Favor", 0);
        choices.put("Against", 0);
        choices.put("Blank", 0);
    }





//    @ManyToOne
//    private User user;


}
