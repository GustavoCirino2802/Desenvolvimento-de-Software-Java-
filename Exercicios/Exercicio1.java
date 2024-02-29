import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        //Função que Digita e Lê a  largura.
        System.out.println("Digite a Largura do Retângulo: ");
        float largura = leitor.nextFloat();
        
        //Função que Digita e Lê a altura.
        System.out.println("Digite a Altura do Retângulo: ");
        float altura = leitor.nextFloat();

        //Função que mostra a aréa do Retângulo.
        System.out.println("A Aréa do Retângulo é: " + largura * altura);
    }
}
