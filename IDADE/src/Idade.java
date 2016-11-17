import java.util.Calendar;
import java.util.Scanner;
public class Idade{
    private static Object calendario;
public static void main (String[] args){
    Scanner entrada = new Scanner(System.in);
int idade;
int ano_atual;
int ano_nascimento;
System.out.println("Qual eh sua data de nascimento para te falar sua idade?");
ano_nascimento = entrada.nextInt();
Calendar data = Calendar.getInstance();
ano_atual=data.get(Calendar.YEAR);
idade = ano_atual - ano_nascimento;
System.out.println("Sua idade eh:" + idade + "anos.");
}
}