import java.util.Scanner;


public class Teste9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int numero2 = sc.nextInt();

        if (numero2 <= 0) {
            System.out.print("O numero nao pode ser menor ou igual a 0. Digite outro numero: ");
            numero2 = sc.nextInt();
        }
        System.out.println("O resultado da divisao é: " + (numero / numero2));
         
       
    }
} 