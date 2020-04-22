package secao10;

import java.util.Scanner;

public class Programmatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = 0;
		int n = 0;
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int numero = 0;
		
		numero = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == numero) {
					System.out.println("Position: " + i + "," + j);
					int k = j - 1;
					if (k >= 0) {
						System.out.println("Left " + mat[i][k]);
					}
					k = j + 1;
					if (k < mat[i].length) {
						System.out.println("Right " + mat[i][k]);
					}
					k = i - 1;
					if (k >= 0) {
						System.out.println("Up " + mat[k][j]);
					}
					k = i + 1;
					if (k < mat.length) {
						System.out.println("Down " + mat[k][j]);
					}
				}
			}
		}
		
		sc.close();
		
		

	}

}
