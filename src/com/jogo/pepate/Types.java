package com.jogo.pepate;

public enum Types {
    PEDRA("Pedra", "Papel", "Tesoura"),
    PAPEL("Papel", "Tesoura", "Pedra"),
    TESOURA("Tesoura", "Pedra", "Papel");

    private String jogada;
    private String derrotas;
    private String vitorias;
    Types(String jogada, String perdePor, String ganhaPor) {
        this.jogada = jogada;
        this.derrotas = perdePor;
        this.vitorias = ganhaPor;
    }

    public String getJogada() {
        return jogada;
    }

    public String getPerdePor() {
        return derrotas;
    }

    public String getGanhaPor() {
        return vitorias;
    }
}
