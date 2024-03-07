import java.util.Scanner;

public class ExercicioFix2 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        String[] nome = new String[5];
        int[] numMat = new int[5];
        float[] nota1 = new float[5];
        float[] nota2 = new float[5];
        float[] notaF = new float[5];

        for (int contador = 0; contador < 5; contador++) {
            System.out.println("\nDigite o seu nome: ");
            nome[contador] = leitor.nextLine();

            System.out.println("\nDigite seu número de matrícula: ");
            numMat[contador] = leitor.nextInt();
            leitor.nextLine();

            System.out.println("\nDigite a sua nota 1: ");
            nota1[contador] = leitor.nextFloat();

            System.out.println("\nDigite a sua nota 2: ");
            nota2[contador] = leitor.nextFloat();
            leitor.nextLine();

            notaF[contador] = (nota1[contador] + nota2[contador]) /2;
            System.out.println("-------------------");
            
        }

        for(int i = 0; i < 5; i++){
        System.out.println("Nome: " + nome[i]);
        System.out.println("Matricula: " + numMat[i]);
        if (notaF[i] >= 7) {
            System.out.println("Resultado: Aprovado!!");
        }
        else {
            System.out.println("Resultado: Reprovado :(");
            }
        System.out.println("Nota Final: " + notaF[i]);
        System.out.println("-------------------------------");
            
        

        }


    }
}

