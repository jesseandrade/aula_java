/*import java.util.Scanner;
public class Operacao {
    public static void main (String [] args){
        Scanner valor = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Digite o primeiro numero: ");
        num1 = valor.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2 = valor.nextInt();
        System.out.println();
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
    }
}
*/

import java.util.Scanner;
public class Operacao {
    public static void main (String[] args){
        Scanner soma = new Scanner(System.in);
        int num1;
        int num2;
        System.out.print("Digite o primeiro numero:");
        num1 = soma.nextInt();
        System.out.print("Digite o segundo numero:");
        num2 = soma.nextInt();
        System.out.printf("\n%d + %d = %d\n", num1, num2, num1 + num2);
       // System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
       // System.out.printf("%d * %d  = %d\n", num1, num2, num1 * num2);
        
    }
}