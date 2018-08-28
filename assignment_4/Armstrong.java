import java.util.*;
public class Armstrong{
		public static void main(String[] x)
		{	
			Scanner Sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int a=Sc.nextInt();
			int num=a;

			int rem;		
			
			int sum=0;
			while(a!=0)
			{
				  rem=a%10;
				sum=sum+(rem*rem*rem);
				a/=10;		
			 }
				if(sum==num)
				{System.out.println("this is armstrong number");}
				else
				{System.out.println("this is not armstrong number");}
		}
}
								
			
