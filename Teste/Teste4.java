import java.util.Scanner;


public class Teste4 {
    public static void main(String[] args){
        Scanner ler_numero = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero = ler_numero.nextInt();
        if(numero == 0) {
            System.out.println("Seu numero é neutro: " + numero);

        }  
        else if(numero > 0) {
            System.out.println("Seu numero é positivo: " + numero);
        }

        else {
            System.out.println("Seu numero é negativo: " + numero);
        }
       
    }
} 