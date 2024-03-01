import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("\nDigite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("\nDigite o seu número de matrícula: ");
        int mat = leitor.nextInt();

        System.out.println("\nDigite a sua nota da AV1: ");
        float nota1 = leitor.nextFloat();

        System.out.println("\nDigite sua nota da AV2: ");
        float nota2 = leitor.nextFloat();


        float notaF = (nota1 + nota2)/2;

        boolean APROVADO = true;

        System.out.println("\nMATRICULA: " + mat);
        System.out.println("NOME: " + nome);
        if (APROVADO){
            System.out.println("\nAPROVADO!");
        } 
        else{
            System.out.println("\nREPROVADO!");
        }
        System.out.println("\nNota Final: " + notaF);
    }

}