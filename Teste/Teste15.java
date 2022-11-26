import java.util.Scanner;

public class Teste15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
         Scanner resposta = new Scanner(System.in);
         double n1, n2, media = 0;
        int cont = 0;
        String conf;

        do{
            System.out.println("Informe a primeira nota:");
            n1 = resposta.nextDouble();
            System.out.println("Informe a segunda nota:");
            n2 = resposta.nextDouble();

            media = (n1 + n2)/2;

            if(media >= 9.5){
                System.out.println("Aluno aprovado, media: " + media);
                cont+=1;
            }
            else{
                System.out.println("Aluno reprovado: " + media);
            }
            System.out.println("Calcular a média de outro aluno Sim ou Nao ?");
            conf = resposta.next();
        }
        while(conf.equals("Sim"));
  }
}
        

       

       
