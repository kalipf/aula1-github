package course;

public class Student {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNotas() {
		return nota1 + nota2 + nota3;
	}
	
	public double notaFaltando(){
		if (somaNotas() < 60) {
			return 60 - somaNotas();			
		}
		else
		{
			return 0;
		}
		
	}
	
}
