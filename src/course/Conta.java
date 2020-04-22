package course;

public class Conta {
	private int count;
	private String nome;
	private double saldo;
	private static int TAXA = 5;

	public Conta() {
	}

	public Conta(int count, String nome, double depositoInicial) {
		this.count = count;
		this.nome = nome;
		deposit(depositoInicial);
	}

	public Conta(int count, String nome) {
		this.count = count;
		this.nome = nome;
	}

	public int getCount() {
		return count;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposit(double quantidade) {
		this.saldo += quantidade;
	}

	public void saque(double quantidade) {
		this.saldo -= quantidade + TAXA;
	}

	public String toString() {
		return "Account " 
	         + this.getCount() + ", Holder: " 
			 + this.getNome() + ", Balance: $ " 
	         + this.getSaldo();
	}

}
