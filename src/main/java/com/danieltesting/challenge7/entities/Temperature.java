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
public class Temperature {

    private float temperature1;
    private float temperature2;
    private float temperature3;
    private float temperature4;

}
