package AssignmentLab1;

import java.util.Scanner;

public class Areaoftriangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the base of traingle:");
		double base=scanner.nextDouble();
		System.out.println("Enter the height of traingle:");
		double height=scanner.nextDouble();
		double area =(base*height)/2;
		System.out.println("Area of traingle:"+area);
		
	}

}
