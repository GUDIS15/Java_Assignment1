package AssignmentLab1;

public class sumofnaturalno {
	public static void main(String[] args) {

        int num = 20, sum = 0;

        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}
