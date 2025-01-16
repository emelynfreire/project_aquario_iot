package com.br.aquario.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "API para Projeto IOT de Monitoriamento de Aquarios", version = "V1.0.0", description = "API genérica para uso do MongoDB desenvolvida para a disciplina de NoSql"))
public class SwaggerConfig {

}