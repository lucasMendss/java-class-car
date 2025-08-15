/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author aluno
 */
public class Carro {
    
    private String nome;
    private String marca;
    private String placa;
    private String nomeDono;
    
    public Carro(String nome, String marca, String placa, String nomeDono){
        this.nome = nome;
        this.marca = marca;
        this.placa = placa;
        this.nomeDono = nomeDono;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getMarca(){
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNomeDono() {
        return nomeDono;
    }
    
}
