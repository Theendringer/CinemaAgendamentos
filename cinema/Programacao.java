/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cinema;

/**
 *
 * @author Gustavo Endringer
 */
public class Programacao {
    private String nome;
    private int faixaEtaria;
    private int capacidade;
    
    public Programacao(String programacao){
        String[] entradaA = programacao.split(";", 3);
        this.nome = entradaA[0];
        this.faixaEtaria= Integer.parseInt(entradaA[1]);
        this.capacidade = Integer.parseInt(entradaA[2]);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setFaixaEtaria(int faixaEtaria){
        this.faixaEtaria = faixaEtaria;
    }
    
    public int getFaixaEtaria(){
        return faixaEtaria;
    }
    
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }
    
    public int getCapacidade(){
        return capacidade;
    }
}
