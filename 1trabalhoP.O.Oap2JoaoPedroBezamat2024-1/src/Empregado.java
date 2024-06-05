public class Empregado {

    private int matricula;
    private float salario;
    private String nome;


    public Empregado(int matricula, float salario, String nome) {
        this.matricula = matricula;
        this.salario = salario;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "matricula=" + matricula +
                ", salario=" + salario +
                ", nome='" + nome + '\'' +
                '}';
    }
}
