package com.crud.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripsDto {
    private Long tripId;
    private String name;
    private Date startDate;
    private Date endDate;
    private String description;
    private Long userId; // For simplicity, we use only userId here
    private List<Long> placeIds; // List of place IDs
}

