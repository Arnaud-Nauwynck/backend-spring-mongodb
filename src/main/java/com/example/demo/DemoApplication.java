package com.example.demo;

import com.example.demo.domain.Tournament;
import com.example.demo.repo.TournamentRepo;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Tournament App API", version = "1.0",
				description = "Rest API using OpenAPI 3 for a tutorial Tournament application"))
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

@Component
class MyCommandLine implements CommandLineRunner {

	@Autowired
	MongoTemplate mongoTemplate;

	@Autowired
	TournamentRepo tournamentRepo;

	@Override
	public void run(String... args) throws Exception {
		Tournament tournament = tournamentRepo.findByName("My Tournament1");
		System.out.println("Tournament: " +  tournament);

//		Query query = new Query();
//		query.addCriteria(Criteria.where("name").eq("My Tournament1"));
//		List<Tournament> users = mongoTemplate.find(query, Tournament.class);
	}
}