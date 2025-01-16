package com.br.aquario.repository;
import com.br.aquario.model.EventModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface EventRepository extends JpaRepository<EventModel, UUID> {
}