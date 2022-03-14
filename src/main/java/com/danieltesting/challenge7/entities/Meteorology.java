package com.danieltesting.challenge7.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity (name = "Meteorology")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table (name = "tbl_meteorology")
public class Meteorology {

    @Id
    @SequenceGenerator(
            name = "meteorology_sequence",
            sequenceName = "meteorology_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy =GenerationType.SEQUENCE,
            generator = "meteorology_sequence"
    )
    @Column (
            name = "meteorology_id",
            updatable = false
    )
    private long id;
    private LocalDateTime date;

    @Embedded
    private Location location;

    @Embedded
    private Temperature temperature;

}
