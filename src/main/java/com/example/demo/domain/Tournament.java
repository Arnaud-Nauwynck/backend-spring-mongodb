package com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document
public class Tournament {

    @Id
    public String id;

    public String name;

    public LocalDateTime createdAt;
    public String createdBy;

    public LocalDate startDate;
    public LocalDate endDate;

}
