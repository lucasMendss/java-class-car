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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carro carroNepo = new Carro("PULSE","FIAT", "ATR7W23", "Lucas Nepo");
        Carro carroMendes = new Carro("MUSTANG","FORD", "EFR1P99", "Lucas Mendes");
        System.out.printf("Carro do %s: %s %s com placa %s \n", carroNepo.getNomeDono(), carroNepo.getMarca(), carroNepo.getNome(), carroNepo.getPlaca());
        System.out.printf("Carro do %s: %s %s com placa %s \n", carroMendes.getNomeDono(), carroMendes.getMarca(), carroMendes.getNome(), carroMendes.getPlaca());
    }
    
}


