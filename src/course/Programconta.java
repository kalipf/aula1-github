package course;

import java.util.Locale;
import java.util.Scanner;

public class Programconta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		Conta conta;
		double quantidade = 0;

		System.out.print("Enter acount number: ");
		int count = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter acount holder: ");
		String nome = sc.nextLine();

		System.out.print("Is there any deposit value (y/n)? ");
		char response = sc.next().charAt(0);

		double saldo = 0;
		
		System.out.println();
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			saldo = sc.nextDouble();
			conta = new Conta(count, nome, saldo);
		} else {
			conta = new Conta(count, nome);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(conta);
		System.out.println("Enter a deposit value: ");
		quantidade = sc.nextDouble();
		conta.deposit(quantidade);

		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(conta);
		System.out.println("Enter a withdraw value: ");
		quantidade = sc.nextDouble();
		conta.saque(quantidade);

		System.out.println();
		System.out.println("Updated account data:");
		System.out.println(conta);

		sc.close();

	}

}
