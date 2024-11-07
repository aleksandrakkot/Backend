package com.crud.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeedbackDto {
    private Long feedbackId;
    private int rating;
    private String comment;
    private Long tripId; // To link to a trip
    private Long userId; // To link to a user
}

