package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNomes {

    private ArrayList<Nome> nomes;

    public ListaNomes() {
        nomes = new ArrayList<>();
        criaNome();
    }

    public void adicionaNome(String prefixo, String sufixo) {
        Nome nome = new Nome(prefixo,sufixo);
        nomes.add(nome);
    }

    public void criaNome() {
        String [] prefixos = new String[10];
        String [] sufixos = new String[10];
        Scanner sc = new Scanner(System.in);
        int y = 0;
        int k = 0;

        while (y < prefixos.length) {
            System.out.println("Digite um prefixo: ");
            prefixos[y] = sc.next();
            y++;
        }

        while (k < sufixos.length) {
            System.out.println("Digite um sufixo: ");
            sufixos[k] = sc.next();
            k++;
        }

        for(int i = 0; i < prefixos.length; i++) {
            for(int j = 0; j < sufixos.length; j++) {
                adicionaNome(prefixos[i], sufixos[j]);
            }
        }
    }

    public void imprimeNomes(){

        StringBuilder stringb = new StringBuilder();

        nomes.forEach((c) -> {
            stringb.append("Nome sugerido: ").append(c.getPrefixo()).append(c.getSufixo()).append("\n");
        });

        System.out.println(stringb.toString());
    }

}
