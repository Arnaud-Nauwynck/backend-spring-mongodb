package com.example.demo.repo;

import com.example.demo.domain.Tournament;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tournaments")
public interface TournamentRepo extends MongoRepository<Tournament,String> {

    Tournament findByName(String name);

}
