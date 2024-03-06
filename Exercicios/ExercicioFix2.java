import java.util.Scanner;

public class ExercicioFix2 {
    public static void main(String[] args){

    Scanner leitor = new Scanner (System.in);

    String[] nome = new String[5];
    int[] numMat = new int[5];
    float[] nota1 = new float[5];
    float[] nota2 = new float[5];
    float[] notaF = new float[5];
    String[] resultado = new String[5]; 

    for(int contador=0; contador < 5;){
    System.out.println("\nDigite o seu nome: ");
    nome [contador] = leitor.nextLine();
    leitor.nextLine();

    System.out.println("\nDigite seu numero de matricula: ");
    numMat [contador] = leitor.nextInt();

    System.out.println("\nDigite a sua nota 1: ");
    nota1 [contador] = leitor.nextFloat();

    System.out.println("\nDigite a sua nota 2:" );
    nota2 [contador] = leitor.nextFloat();

    contador ++;


    }




    }
}

