package Atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author Priscila Butzke
 */
/* Crie um algoritmo que leia um n° de 1 até 9
O programa deverá clacular o fatorial deste n°.
3! = 3 * 2 * 1 = 6   
5! = 5 * 4* 3* 2* 1 = 120
 */
public class Atividade4 {

    public static void main(String[] args) {

        int num, fat = 1;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Fatorial:"
                + "\nDigite um número entre 1 e 9: "));

        for (int i = 1; i <= num; i++) {
            fat *= i;

/* Logica do algoritmo
5! = 
fat = fat * i;
fat = 1 * 1 -> 1
fat = 1 * 2 -> 2
fat = 2 * 3 -> 6
fat = 6 * 4 -> 24
fat =24 * 5 -> 120 */
        }

        JOptionPane.showMessageDialog(null, "Fatorial de " + num + "! = " + fat);
    }
}
