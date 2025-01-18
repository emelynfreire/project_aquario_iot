package com.br.aquario.config;

import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    public Info infoApi(){
        return new io.swagger.v3.oas.models.info.Info()
                .description("API para Projeto IOT de Monitoriamento de Aquarios")
                .title("Aquario_IOT API REST")
                .version("V1.0.0");
    }

}