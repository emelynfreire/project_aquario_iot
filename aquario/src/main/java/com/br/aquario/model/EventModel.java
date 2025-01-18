package com.br.aquario.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "eventos")
public class EventModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDateTime data;
    @Enumerated(EnumType.STRING)
    private EventType type;     // Enum para o tipo do evento

    public EventModel() {
        this.data = LocalDateTime.now();
    }

}
