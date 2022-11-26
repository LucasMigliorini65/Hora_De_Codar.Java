import java.util.Scanner;


public class Teste11 {
    public static void main(String[] args){
            Double a, b, c, d;
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, informe quatro notas: ");

    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    d = sc.nextDouble();
    
    Double soma = a + b + c + d;
    Double media = soma/4;
    if(media > 6) {
        System.out.println("Aprovado monstro");
    }
    else {
        System.out.println("Reprovado no enem ");
    }


       
    }
} 