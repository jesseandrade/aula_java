package media;
    import java.util.Scanner;
        public class MEDIA{   
            public static void main (String[] args){
                
                    float nota1, nota2, nota3, nota4, media;
    
    Scanner nota = new Scanner(System.in);
    
        System.out.printf("######Informe as 4 notas para o calculo da Media:######\n");
        System.out.printf("Informe a primeira nota:");
        nota1 = nota.nextFloat();
        System.out.printf("Informe a segunda nota: ");
        nota2 = nota.nextFloat();
        System.out.printf("Informe a terceira nota: ");
        nota3 = nota.nextFloat();
        System.out.printf("Por fim informe a ultima nota:");
        nota4 = nota.nextFloat();
        System.out.printf("Vamos calcular sua Media agora!!!\n");
        System.out.printf( nota1 + " + " + nota2 + " + " + nota3 + " + " + nota4 + " = " + (nota1+nota2+nota3+nota4)/4);
    
}
}