import java.util.Scanner;

public class Teste14 {
    public static void main(String[] args){
Scanner resposta = new Scanner(System.in);
  int n1, n2, acum = 0, calculo = 0;

        System.out.println("Informe o primeiro número");
        n1 = resposta.nextInt();

        System.out.println("Informe o segundo número");
        n2 = resposta.nextInt();

        while(n1 <= n2){
            acum = acum + n1;
            n1++;
            calculo++;
        }
        System.out.println("O resultado é: " + acum/calculo);
    }
    }
