import java.util.Scanner;

public class Console {

    public static void main(String[] args){

            Scanner leitor = new Scanner (System.in);

            //Leitura do texto digitado pelo usuário.
            System.out.println("Digite um texto: ");
            String texto = leitor.nextLine();
            System.out.println("Texto digitado: " + texto);

            //Leitura de um inteiro digitado pelo usuário
            System.out.println("Digite um número inteiro: ");
            int numero = leitor.nextInt();
            System.out.println("Número digitado: " + numero);





    }

}
