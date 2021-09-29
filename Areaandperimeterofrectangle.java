package AssignmentLab1;

import java.util.Scanner;

public class Areaandperimeterofrectangle {
	
	public static void main (String[] args)
	{
		int l,b , peri, area;
		Scanner in = new Scanner(System.in);//to read input 
		 
		System.out.println("Enter the Area of rectangle:");
		l= in.nextInt();
		System.out.println("Enter the Perimeter of the rectangle:");
		b= in.nextInt();
		area = l * b;
	
		System.out.println("Area of rectangle:"+area);
		
		peri =  2 * (l + b);
		System.out.println("Perimeter of rectangle:"+peri);
		
}

}