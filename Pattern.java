package AssignmentLab1;

public class Pattern {
	public static void printStars(int n)
    {
        int i, j;
 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing according. to outer loop   
            for(j=0; j<=i; j++)
            {
                // printing zeros
                System.out.print("0 ");
            }
 
            // ending line after each row
            System.out.println();
        }
   }
 
    // Driver Function
    public static void main(String args[])
    {
        int n = 10;
        printStars(n);
    }

}
