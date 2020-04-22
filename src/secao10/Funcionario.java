package secao10;

public class Funcionario {
	private int id;
	private String name;
	private double salary;
	
	public Funcionario(int id, String nome, double salario) {
		this.id = id;
		this.name = nome;
		this.salary = salario;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void increaseSalary(double percentage) {
		this.salary += this.salary * (percentage / 100);		
	}
	
	public String toString() {
		return id 
			+  ", "
			+  name
			+ ", "
			+ salary;
	}
	
}
