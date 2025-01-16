package com.br.aquario.model;

public enum EventType {
    ALIMENTACAO("Alimentação"),
    FILTRO("Verificação do Filtro"),
    TROCA_AGUA("Troca de Água");

    private final String description;

    EventType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}

