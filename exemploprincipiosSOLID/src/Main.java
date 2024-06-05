//principio Single Responsibility - responsabilidade única. É um dos principios da metodologia SOLID e diz que
//uma função/metodo/classe deve ter somente uma unica funcionalidade/objetivo a ser realizado, ao inves de varias, para facilitar na organização do código


// Classe que representa um funcionário
public class Employee {
    private String id;
    private String name;
    private String department;

    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Método para exibir informações do funcionário
    public void displayEmployeeInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Classe responsável pela persistência dos dados dos funcionários
public class EmployeeRepository {
    // Método para salvar um funcionário (exemplo simples, sem banco de dados)
    public void saveEmployee(Employee employee) {
        // Código para salvar o funcionário
        System.out.println("Saving employee: " + employee.getName());
    }

    // Método para deletar um funcionário
    public void deleteEmployee(Employee employee) {
        // Código para deletar o funcionário
        System.out.println("Deleting employee: " + employee.getName());
    }

    // Outros métodos relacionados à persistência dos dados
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("1", "John Doe", "Engineering");
        EmployeeRepository repository = new EmployeeRepository();

        // Exibindo informações do funcionário
        employee.displayEmployeeInfo();

        // Salvando o funcionário
        repository.saveEmployee(employee);

        // Deletando o funcionário
        repository.deleteEmployee(employee);
    }
}


//no exemplo a seguir vemos uma classe que representa os funcionários, e outra classe que existe somente para gerenciar os dados relativos e funcionários, podendo deletar ou adicionar novos elementos a classe ja existente funcionário, exemplificando o
//Single Responsibility Principle que diz que cada classe deve ter uma função específica dentro do código. Logo o ideal seria existir essa separação entre a classe funcionários/employee e a clsse employee repository, que existe somente para manipular os dados da classe pré-existente de empregados.