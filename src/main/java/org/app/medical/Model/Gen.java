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
@Table(name = "gens_normalized")
public class Gen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private String ensemblID;
    private String geneensembl;
    private String genebiotype;
    private double G146_ctr_H;
    private double G146_ctr;
    private double G146_treat_H;
    private double G146_treat;
    private double G34_ctr_H;
    private double G34_ctr;
    private double G34_treat_H;
    private double G34_treat;
    private double G44_ctr_H;
    private double G44_ctr;
    private double G44_treat_H;
    private double G44_treat;
    private double G62_ctr_H;
    private double G62_ctr;
    private double G62_treat_H;
    private double G62_treat;
    private double G88_ctr_H;
    private double G88_ctr;
    private double G88_treat_H;
    private double G88_treat;
}
