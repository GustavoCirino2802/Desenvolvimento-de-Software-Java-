import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu Nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o seu Sobrenome: ");
        String sobrenome = leitor.nextLine();

        System.out.println("Seu nome completo é: " + nome + sobrenome );


    }
}
