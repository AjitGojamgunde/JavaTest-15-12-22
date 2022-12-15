package exercise1;
import java.util.Scanner;


public class CountDigits {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		long count = 0;
		
		System.out.println("enter a digits");
		long num = s.nextLong();
		
		while (num  != 0)
		{num =  num/10;
		count++;
		
		}
		System.out.println("numbers of didgit in given number"+count);
			
	}

}
