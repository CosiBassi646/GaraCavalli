package com.gara;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cavallo> partecipanti = new ArrayList<>();
        ArrayList<String> classifica = new ArrayList<>();
        Corsa c = new Corsa(5, partecipanti, classifica);


        //aggiungo i cavalli all'array dei partecipanti
        for(int i = 0; i < 20; i++){
            c.aggiungi(new Cavallo("cavallo" + (i+1), c));
        }


        System.out.println("Risultati della Gara di cavalli: ");
        
        for(int i=0;i<partecipanti.size();i++){
            partecipanti.get(i).start();
        }

        for(int i=0;i<classifica.size();i++){
            System.out.println(classifica.get(i));
        }
    }
}