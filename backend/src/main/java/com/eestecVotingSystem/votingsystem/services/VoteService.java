package com.eestecVotingSystem.votingsystem.services;

import com.eestecVotingSystem.votingsystem.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.eestecVotingSystem.votingsystem.models.Vote;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;
@Service
public class VoteService implements VoteRepository {

    @Autowired
    VoteRepository voteRepository;


    public void addVote(Vote vote){

    }

//    public ArrayList<Vote> getAllStudents(){
//        return (ArrayList<Vote>) voteRepository;
//    }

}
