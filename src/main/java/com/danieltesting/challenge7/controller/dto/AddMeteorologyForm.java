package com.danieltesting.challenge7.controller.dto;

import com.danieltesting.challenge7.entities.Location;
import com.danieltesting.challenge7.entities.Temperature;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class AddMeteorologyForm {


    private LocalDate date;
    private Location location;
    private float[] temperature;



}
