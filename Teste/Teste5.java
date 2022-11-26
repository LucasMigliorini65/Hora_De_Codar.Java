import java.util.Scanner;


public class Teste5 {
    public static void main(String[] args){
        Scanner ler_v1 = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int v1 = ler_v1.nextInt();

         Scanner ler_v2 = new Scanner(System.in);
        System.out.print("Digite um segundo valor: ");
        int v2 = ler_v2.nextInt();

         Scanner ler_v3 = new Scanner(System.in);
        System.out.print("Digite um terceiro valor: ");
        int v3 = ler_v3.nextInt();

        if(v1 > v2 && v1 > v3) {
            System.out.println("valor1 é o maior valor!");

        }  
        else if(v2 > v1 && v2 > v3) {
            System.out.println("valor2 é o maior valor!");
        }

        else {
            System.out.println("Valor3 é o maior valor");
        }
       
    }
} 