import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a sua idade: ");
        int idade = leitor.nextInt();

        if(idade <= 13){
            System.out.println("Criança!");
        }
        if(idade > 13 && idade <=18){
            System.out.println("Adolescente!");
        }
        if(idade > 18 && idade <=60){
           System.out.println("Adulto!");
        }
        if(idade > 60){
            System.out.println("Idoso!");
        }



    }
}
