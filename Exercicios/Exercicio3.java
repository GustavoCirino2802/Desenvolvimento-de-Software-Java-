import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        //Funções que recebem e lêem dois numeros inteiros.
        System.out.println("Digite um número inteiro: ");
        int num1 = leitor.nextInt();
        
        System.out.println("Digite outro número inteiro: ");
        int num2 = leitor.nextInt();
        int maior , menor;

        //Função para encontrar o maior número.        
        if(num1 > num2){
            maior = num1;
        }
            else {
                maior = num2;
            }       

        //Função para encontrar o menor número.
        if(num1 < num2){
            menor = num1;
        }
            else {
                menor = num2;
            }   
        
        //Função que mostra o menor e o maior número.
        System.out.println("O Maior número é: " + maior);
        System.out.println("O Menor número é: " + menor);
    }
}
