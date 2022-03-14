package com.danieltesting.challenge7.controller;

import com.danieltesting.challenge7.entities.Location;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record Meteorology(long id, LocalDate date, Location location, float[] temperature) {
}
