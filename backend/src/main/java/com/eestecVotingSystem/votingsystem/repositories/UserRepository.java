package com.eestecVotingSystem.votingsystem.repositories;

import com.eestecVotingSystem.votingsystem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
