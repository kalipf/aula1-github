package course;

import java.util.Locale;
import java.util.Scanner;

public class Programemployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		employee.name = sc.nextLine();
		employee.grossSalary = sc.nextDouble();
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.print("Which percentage to increase salary?");
		
		employee.increaseSalary(sc.nextDouble());
				
		System.out.println("Updated data: " + employee);
		
		
		
		
		
		sc.close();

	}

}
