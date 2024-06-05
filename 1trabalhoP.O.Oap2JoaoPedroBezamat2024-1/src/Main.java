import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Joao Pedro Bezamat, Programaçao OO, matricula 202301216109


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();

        // Obtendo os dados de 5 empregados via teclado
        for (int i = 0; i < 5; i++) {
            System.out.println("Cadastro do Empregado " + (i + 1));
            System.out.print("Matrícula: ");
            int matricula = scanner.nextInt();
            System.out.print("Salário: ");
            float salario = scanner.nextFloat();
            scanner.nextLine(); // Consumir a nova linha
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            Empregado empregado = new Empregado(matricula, salario, nome);
            empregados.add(empregado);
        }

        //ajusta o salario e exibw
        System.out.println("\nDados dos empregados com o novo salário:");
        for (Empregado empregado : empregados) {
            float novoSalario = calcularNovoSalario(empregado.getSalario());
            empregado.setSalario(novoSalario);
            System.out.println(empregado);
        }


        // exibe salario acima de 3 mil
        System.out.println("\nEmpregados com salário acima de 3000:");
        for (Empregado empregado : empregados) {
            if (empregado.getSalario() > 3000) {
                System.out.println("Matrícula: " + empregado.getMatricula() + ", Nome: " + empregado.getNome().toUpperCase());
            }
        }
    }
    //metodo para calcular salario novo
    public static float calcularNovoSalario(float salario) {
        if (salario <= 1000) {
            return salario * 1.20f;
        } else if (salario > 1000 && salario < 2000) {
            return salario * 1.15f;
        } else if (salario > 2000 && salario < 3000) {
            return salario * 1.10f;
        } else {
            return salario * 1.05f;
        }
    }
}




