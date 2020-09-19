package edu.wctc.distjavazodiac.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Fortune")
public class Fortune {
    @Id
    @Column(name = "fortune_id")
    private int id;
    @Column(name = "text")
    private String text;
}
