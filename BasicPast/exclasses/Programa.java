package exclasses;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
       
    Scanner leitor = new Scanner (System.in);

    //Um Aluno
    //String matricula;
    //String nome;
    //double nota1;
    //double nota2;

    //Aluno objaluno = new Aluno();

    //System.out.println("Digite a matrícula: ");
    //objaluno.matricula = leitor.nextLine();

    //System.out.println("Digite seu nome: ");
    //objaluno.nome = leitor.nextLine();

    //System.out.println("Digite a nota 1: ");
    //objaluno.nota1 = leitor.nextDouble();

    //System.out.println("Digite a nota 2: ");
    //objaluno.nota2 = leitor.nextDouble();

    //System.out.println("Matrícula: " + objaluno.matricula);
    //System.out.println("Nome: " + objaluno.nome);
    //System.out.println("Nota 1: " + objaluno.nota1);
    //System.out.println("Nota 2: " + objaluno.nota2);


    //Cinco Alunos
    Aluno[] alunos = new Aluno[1];
    alunos[0] = new Aluno();

    System.out.println("Digite a matrícula: ");
    alunos[0].matricula = leitor.nextLine();

    System.out.println("Digite seu nome: ");
    alunos[0].nome = leitor.nextLine();

    System.out.println("Digite a nota 1: ");
    alunos[0].nota1 = leitor.nextDouble();

    System.out.println("Digite a nota 2: ");
    alunos[0].nota2 = leitor.nextDouble();

    System.out.println("Matrícula: " + alunos[0].matricula);
    System.out.println("Nome: " + alunos[0].nome);
    System.out.println("Nota 1: " + alunos[0].nota1);
    System.out.println("Nota 2: " + alunos[0].nota2);






    leitor.close();

    }
}
