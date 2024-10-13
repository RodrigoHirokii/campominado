package io.github.rodrigohiroki;

import io.github.rodrigohiroki.modelo.Tabuleiro;
import io.github.rodrigohiroki.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        TabuleiroConsole tabuleiroConsole = new TabuleiroConsole(tabuleiro);

        System.out.println(tabuleiro);

    }
}
