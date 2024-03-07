import java.util.Scanner;

public class ExercicioFix3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o seu número de matrícula: ");
        int numMat = leitor.nextInt();

        float[] notas = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a sua nota da Av " + (i + 1));
            notas[i] = leitor.nextFloat();
        }

        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + numMat);
        for (int x = 0; x < 5; x++) {
            System.out.println("Nota " + (x + 1) + ": " + notas[x]);
        }
    }
}
