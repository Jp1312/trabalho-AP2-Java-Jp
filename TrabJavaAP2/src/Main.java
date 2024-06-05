import java.util.ArrayList;
import java.util.Scanner;

class Aluno {
    private int matricula;
    private String nome;
    private int idade;
    private double notaAv1;
    private double notaAv2;

    public Aluno(int matricula, String nome, int idade, double notaAv1, double notaAv2) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.notaAv1 = notaAv1;
        this.notaAv2 = notaAv2;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMedia() {
        return (notaAv1 + notaAv2) / 2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite os dados do aluno " + (i + 1) + ":");
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Nota AV1: ");
            double notaAv1 = scanner.nextDouble();
            System.out.print("Nota AV2: ");
            double notaAv2 = scanner.nextDouble();

            Aluno aluno = new Aluno(matricula, nome, idade, notaAv1, notaAv2);
            alunos.add(aluno);
        }

        System.out.println("\nNome de cada aluno seguido de sua média:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + ": " + aluno.getMedia());
        }

        System.out.println("\nPrimeira letra do nome de cada aluno seguido de sua matrícula:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome().charAt(0) + ": " + aluno.getMatricula());
        }

        System.out.println("\nMatrículas dos alunos com média acima de 7 pontos:");
        boolean encontrouAluno = false;
        for (Aluno aluno : alunos) {
            if (aluno.getMedia() > 7) {
                System.out.println(aluno.getMatricula());
                encontrouAluno = true;
            }
        }
        if (!encontrouAluno) {
            System.out.println("Nenhum aluno com média acima de 7 pontos foi encontrado.");
        }

        scanner.close();
    }
}
