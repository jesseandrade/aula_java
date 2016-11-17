package aula06;

import java.util.Scanner;
import java.util.Calendar;
public class Entrada {

    public static void main (String[] args) {
        Scanner entrada = new scanner(System.in);
        System.out.println("Digite sua idade:");
        Calendar calendario = Calendar.getInsta();
        System.out.printf("Voce nasceu em" + (calendario.get(Calendar.YEAR) - entrada.nextInt()) + "\n");
    }
}
