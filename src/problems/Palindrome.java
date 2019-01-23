package problems;

import java.util.Scanner;

public class Palindrome {
	private static Scanner scanner;

	public static void main(String args[])
	{
		System.out.println("Enter a string to check whether it is a palindrome or not: ");
		scanner = new Scanner(System.in);
		String str1=scanner.nextLine();
		String str2=str1;
		
		boolean chk=true;
		
		for(int i=0,j=str2.length()-1;i<str1.length() && j>=0 ;i++,j--)
			{
				if(str1.charAt(i)!=str2.charAt(j))
				{
					chk=false;
					break;
				}
				else
				{
					chk=true;
				}
			}

		if(chk)
		{
			System.out.println("The given string is a palindrome");
		}
		else
		{
			System.out.println("The given string is not a palindrome");
		}
		
		System.out.println("Enter a number to check whether it is a palindrome or not: ");
		scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		int temp=num,rev=0;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
		System.out.println(temp +" "+rev);
		if(temp==rev)
			System.out.println("It is a palindrome");
		else
		{
			System.out.println("Not a palindrome");
		}
	}
}
