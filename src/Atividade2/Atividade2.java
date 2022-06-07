package Atividade2;

import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 */
/* Crie um programa que leia uma quantidade indeterminada de valores, o programa termina quando digitado um n° negativo.
Ao sair o programa mostra a soma dos números pares e a média dos números impares.*/
public class Atividade2 {

    public static void main(String[] args) {

        double acPar = 0, acImpar = 0, n = 0, ci = 0;
        double media = 0;

        //Leitura inicial do número.
        Scanner ler = new Scanner(System.in);
        System.out.println("\nN° maior que 0 para iniciar."
                + "\nN°menor ou igual 0 para sair."
                + "\nDigite um número: ");
        n = ler.nextDouble();

        // Número maior que zero.
        while (n > 0) {

            if (n % 2 == 0) {
                acPar += n; //soma dos valores pares, mesma coisa que acpar = acPar +n;
            } else {
                acImpar += n; //soma dos valores impares, mesma coisa que acImpar = acImpar + n;
                ci++;
                media = acImpar / ci;
            }
            System.out.println("Digite outro número");
            n = ler.nextDouble();
        }
        //Saida do Loop se o número for menor que zero
        System.out.println("Soma dos pares:" + acPar);
        System.out.println("Média dos impares " + media);
    }
}
