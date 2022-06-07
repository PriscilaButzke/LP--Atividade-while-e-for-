
package Atividade1;

/**
 *
 * @author Priscila Butzke
 */

/* Chico tem 1.50 e cresce 2cm por ano, enquanto Zé tem 1.10 e cresce 3cm por ano.
Construa um algoritmo que calcule e imprima quantos anos são necessários para Zé ser maior que Chico*/
public class Atividade1{
    public static void main(String[] args) {
        double chico = 1.50, ze = 1.10;
        int ano = 0;
        
        while(chico >= ze){
            
            chico = chico + 0.02;
            ze = ze + 0.03;
            ano++;
        } 
        System.out.println("Em " + ano+ " anos Zé será maior que Chico.");
    }
}

  
