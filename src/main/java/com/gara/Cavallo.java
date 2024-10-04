package com.gara;

public class Cavallo extends Thread{
    private String nome;
    private Corsa c;

    public Cavallo(String nome, Corsa c){
        this.nome = nome;
    }

    @Override
    public void run() {
        for(int i=0;i < c.getDistanza(); i++){
       //     Thread.sleep((int) (Math.random() * 1000));
        }
        c.aggiungiClassifica(this.nome);
    }
    
}
