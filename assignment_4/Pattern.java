import java.util.*;
public class Pattern{
		public static void main(String[] x)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int n=sc.nextInt();
			int i,j;
			for(i=n;i>=1;i--)
			{
				for(j=1;j<=i;j++)
					{
						System.out.print("*");
					}
			
			System.out.println();
			}
		}
}
