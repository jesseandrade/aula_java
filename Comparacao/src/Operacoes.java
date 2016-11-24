/*
import java.util.Scanner;
public class Comparacao {
    public static void main (String[] args){
        float num1, num2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        num1 = entrada.nextFloat();
        System.out.print("Digite o segundo numero: ");
        num2 = entrada.nextFloat();
        System.out.printf("%.2f > %.2f -> %s\n", num1, num2, num1 > num2);
        System.out.printf("%.2f >= %.1f -> %s\n", num1, num2, num1 >= num2);
        System.out.printf("%.2f < %.2f -> %s\n", num1, num2, num1 < num2);
        System.out.printf("%.2f <= %.2f -> %s\n", num1, num2, num1 <= num2);
        System.out.printf("%.2f == %.2f -> %s\n", num1, num2, num1 == num2);
        System.out.printf("%.2f != %.2f -> %s\n", num1, num2, num1 != num2);
    }
}

*/

import java.util.Scanner;
public class Operacoes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
    int num1;
        int num2;
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2) );
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2) );
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2) );
    }
}