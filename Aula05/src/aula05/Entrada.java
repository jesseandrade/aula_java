package aula05;

import java.util.Scanner;

public class Entrada{
    
    public static void main (String [] args){
        
        Scanner entrada = new Scanner(System.in);        
        int idade;        
        System.out.println("Digite sua idade:");        
        idade = entrada.nextInt();
        System.out.println("Sua idade é" + idade + "\n") ;
    }
    
}