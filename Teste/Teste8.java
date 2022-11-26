import java.util.Arrays;
import java.util.Scanner;

public class Teste8 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int maior1 = 0;
        int maior2 = 0;

        //* Para informar todos os 5 numbers *//
        for(int i = 0; i < 5; i++){
            System.out.print("Digite um numero: ");
            numero = scanner.nextInt();

            if(numero > 0){
                if(numero > maior1){
                    if(i >= 1){
                        maior2 = maior1;
                    }
                    maior1 = numero;
                }else if(numero > maior2){
                    maior2 = numero;
                }
            }

        }
        int result = maior1 + maior2;
        System.out.println("A soma dos maiores é: " + result);

    }
}