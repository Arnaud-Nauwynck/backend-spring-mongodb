package com.example.demo.rest;

import com.example.demo.rest.dto.TournamentCreateRequestDTO;
import com.example.demo.rest.dto.TournamentCreateResponseDTO;
import com.example.demo.service.TournamentService;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tournament")
@OpenAPIDefinition(
        // tags = { Tag("Tournament") }
)
public class TournamentRestController {

    @Autowired
    private TournamentService tournamentService;

    @PostMapping()
    @Operation(summary = "Create a new (unique by name) tournament")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation"),
            @ApiResponse(responseCode = "500", description = "name already used"),
    })
    public TournamentCreateResponseDTO createTournament(
            @RequestBody TournamentCreateRequestDTO req) {
        return tournamentService.createTournament(req);
    }
}
