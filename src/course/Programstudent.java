package course;

import java.util.Locale;
import java.util.Scanner;

public class Programstudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Digite o nome: ");
		student.nome = sc.nextLine();
		
		System.out.print("Digite a nota do primeiro trimeste: ");
		student.nota1 = sc.nextDouble();		
		System.out.print("Digite a nota do primeiro trimeste: ");
		student.nota2 = sc.nextDouble();		
		System.out.print("Digite a nota do primeiro trimeste: ");
		student.nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE: %.2f ", student.somaNotas());
		
		if   (student.somaNotas() > 60) {
			System.out.println("PASSED");
		}
		else {
			System.out.println("FAILED");
			System.out.println("MISSING " + student.notaFaltando() + " POINTS");
		}	
		sc.close();
	}

}
