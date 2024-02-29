import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        
        //Função que Recebe e Lê o valor em real.
        System.out.println("Digite o valor em Real: ");
        float real = leitor.nextFloat();

        //Função que mostra o valor em Real para Dólar, Euro e Peso Argentino.
        System.out.println("O Valor em Dólar é: " + real * 5.17);
        System.out.println("O Valor em Euro é: " + real * 6.14);
        System.out.println("O Valor em Peso Argentino é: " + real * 0.05);

    }

}
