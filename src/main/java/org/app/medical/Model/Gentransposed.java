package org.app.medical.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
@Table
public class Gentransposed {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private double x;
    private double y;
    private String name;
    private String patient;
    private String treatment;
}
