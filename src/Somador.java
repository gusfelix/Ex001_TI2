import java.util.Scanner;

public class Somador
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		int x, y;
		
		System.out.print("x = ");
		x = in.nextInt();
		
		System.out.print("y = ");
		y = in.nextInt();
		
		
		System.out.print("x + y = "+ (x + y));
		
	}
}
