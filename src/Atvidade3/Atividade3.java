package Atvidade3;
import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
/* Crie um algoritmo que leia um número  qualquer e o programa mostra a tabuada deste número.*/
public class Atividade3 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int num = 0, mult = 0, res = 0;
        
        System.out.println("Digite um número: ");
        num = ler.nextInt();
        
        while(mult <11){
            res = num * mult;
            System.out.println(mult + " x " + num + " = " + res);
            mult++; 
        }
    }
}
