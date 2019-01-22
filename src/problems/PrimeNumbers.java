package problems;

import java.util.Scanner;

public class PrimeNumbers {
	
	private static Scanner scanner;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the range till where the prime nums must be printed: ");
		scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
		boolean pr=true;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					pr = false;
					break;
				}
				else
				{
					pr=true;
				}
			}
			if(pr==true && i!=1 && i!=2)
				System.out.println(i);
		}
		
		
		for(int j=2;j<=n;j++)
		{
			int s=(int)Math.sqrt(j)+1;
			for(int i=2;i<=s;i++)
				{
					if(j%i==0)
						break;
					else
						System.out.println(j);
				}
		}
		
	}
	
}
