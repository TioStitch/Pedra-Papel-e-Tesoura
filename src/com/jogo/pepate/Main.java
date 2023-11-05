package com.jogo.pepate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static List<String> contra_ataque = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Escolha sua jogada!");
        System.out.println("PEDRA, PAPEL, TESOURA");

        startJogadas();

        Random rD = new Random();
        String contra = contra_ataque.get(rD.nextInt(2));

        Scanner sc = new Scanner(System.in);
        String sua_jogada = sc.next();

        if (!contra_ataque.contains(sua_jogada)) {
            System.out.println("[ERRO] Insira uma jogada válida!");
        }

        Types suaTipo = Types.valueOf(sua_jogada);
        Types inimigoTipo = Types.valueOf(contra);

        System.out.println("Jogada Adversário: " + contra);

        if (suaTipo.equals(inimigoTipo)) {
            System.out.println("[EMPATE] Realize uma jogada novamente!");
        }


        if (suaTipo.getPerdePor().equals(inimigoTipo.getJogada())) {
            System.out.println("[DERROTA] Você perdeu! Jogue novamente!");
        } else if (suaTipo.getGanhaPor().equals(inimigoTipo.getJogada())) {
            System.out.println("[VITÓRIA] Parabéns, você ganhou!");
        }
    }

    private static void startJogadas() {
        contra_ataque.add("PEDRA");
        contra_ataque.add("PAPEL");
        contra_ataque.add("TESOURA");
    }
}