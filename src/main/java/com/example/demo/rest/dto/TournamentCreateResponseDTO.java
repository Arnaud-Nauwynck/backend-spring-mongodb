package com.example.demo.rest.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TournamentCreateResponseDTO {
    public String id;
    public String name;
    public LocalDateTime createdDate;
    public String createdBy;

    public TournamentCreateResponseDTO() {
    }
    public TournamentCreateResponseDTO(String id, String name, LocalDateTime createdDate, String createdBy) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

}
