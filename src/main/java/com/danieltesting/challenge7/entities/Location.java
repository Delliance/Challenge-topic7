package com.danieltesting.challenge7.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Location {

    private double latitude;
    private double longitude;
    private String city;
    private String state;

}
