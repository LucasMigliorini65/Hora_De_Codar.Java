import java.util.Scanner;


public class Teste7 {
    public static void main(String[] args){
        int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Por favor, informe três números");

    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    double resultado = Math.min(a, Math.min(b, c));
    System.out.println(" A soma sera de " + (a + b + c - resultado));

        
       
    }
} 