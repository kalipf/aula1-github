package secao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Funcionario> list = new ArrayList<>();
		
		Funcionario func;
		
		for(int i = 1; i <= n; i++ ) {
			System.out.println();
			
			System.out.println("Employee: #" + i);			
			System.out.print("Id:");			
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
						
			System.out.print("Salary: ");
			double salary = sc.nextDouble();		
						
			list.add(new Funcionario(id, name, salary));
			
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		
		int id = sc.nextInt();
		
		func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (func == null) {
			System.out.println("Funcionário não existe!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			func.increaseSalary(percentage);
		}
		
		
		System.out.println("List of employees:");
		
		for (Funcionario x : list) {
			System.out.println(x);
			}
		
		sc.close();

	}

}
