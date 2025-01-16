package com.br.aquario.repository;

import com.br.aquario.model.MetricasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MetricasRepository extends JpaRepository<MetricasModel, UUID>
{
}
