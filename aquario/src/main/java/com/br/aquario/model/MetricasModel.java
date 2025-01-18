package com.br.aquario.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "metricas")
public class MetricasModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDateTime data;
    private float valuePH;
    private float levelAmonia;
    private float temperature;
    private int luminosity;
    private boolean outRange;

    public MetricasModel(){
        this.data = LocalDateTime.now();
    }
}
