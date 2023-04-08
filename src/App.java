import java.util.Scanner;

 public class App {

     // Início do Programa
     public static void main(String[] args) throws Exception {

        // Declaração de Variaveis
        double altura;
        double peso_ideal;

        //Solicitação de Dados
        Scanner teclado = new Scanner (System.in);
        System.out.println ("Informe sua altura: " );
        altura = teclado.nextDouble();
        teclado.close();

        // Fazer o calculo do peso ideal
        peso_ideal = (72.7 * altura) - 58;

        // Exibir a resposta para o usuário
        System.out.println ("Seu peso ideal é: " + peso_ideal);


       
    }
}
