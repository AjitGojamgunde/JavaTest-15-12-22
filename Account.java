package exercise1;
import java.util.Scanner;

public class Account {
	public static void main(String[]args) {
		int i;
		int pin = 2551;
		int user_pin;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(i=0;i<3;i++)
		{
			System.out.println("enter pin");
			user_pin = sc.nextInt();
			
			if(user_pin == pin)
			{
				System.out.println("correct,welcome back");
				
				break;
			}
			else
			{
				System.out.println("incorrect pin,try again");
				count++;
			}
		}
		if(count >= 3)
		{
			System.out.println("sorry you have locked out");
		}
		sc.close();
	}
				
			
			
			}
		
		
			
			
