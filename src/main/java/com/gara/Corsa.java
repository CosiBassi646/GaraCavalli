package com.gara;

import java.util.ArrayList;

public class Corsa  {
    private int distanza;
    private ArrayList<Cavallo> Partecipanti = new ArrayList<>();
    private ArrayList<String> classifica = new ArrayList<>();

    
    public int getDistanza() {
        return distanza;
    }


    public void setDistanza(int distanza) {
        this.distanza = distanza;
    }


    public Corsa(int distanza, ArrayList<Cavallo> partecipanti, ArrayList<String> classifica) {
        this.distanza = distanza;
        this.Partecipanti = partecipanti;
        this.classifica = classifica;
    }

    public void aggiungi(Cavallo c){
        Partecipanti.add(c);
    }

    public void aggiungiClassifica(String c){
        classifica.add(c);
    }
}
