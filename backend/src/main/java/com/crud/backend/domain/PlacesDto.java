package com.crud.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlacesDto {
    private Long placeId;
    private String name;
    private String city;
    private String description;
}

