import java.util.*;
public class Reverse{
		public static void main(String[] x)
		{
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter a number");
			int a=Sc.nextInt();		
			int b=0;
			int r;
			while(a!=0)
			{
				r=a%10;
				b=b*10+r;
				a/=10;
			}
			System.out.println("Reverse of a is "+ b);
		}
}
