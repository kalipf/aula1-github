package course;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAluguel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel vect[] = new Aluguel[10];
		
		System.out.println("How many rooms will be rented? ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();			
			System.out.println("Rent #" + i + ":");
			
			sc.nextLine();
			
			System.out.print("Name: ");			
			String nome = sc.nextLine();
						
			System.out.print("Email: ");			
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int room = sc.nextInt();			
			
			vect[room] = new Aluguel(nome, email);
						
		}
		
		System.out.println();
		
		for(int i = 0; i < vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i].getNome() + ", " + vect[i].getEmail());				
			}
		}
		
		sc.close();

	}

}
