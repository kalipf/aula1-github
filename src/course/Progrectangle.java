package course;

import java.util.Locale;
import java.util.Scanner;

public class Progrectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle areaR = new Rectangle();		
		
		System.out.println("Enter Rectangle width and height: ");
		
		areaR.height = sc.nextDouble();
		areaR.width  = sc.nextDouble();
		
		System.out.println(areaR);
		
		sc.close();

	}

}
