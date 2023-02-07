/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: MM/DD/YYYY
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Christopher Newman
*/


//This allows me to use scanner so I can get the users input
import java.util.Scanner;

public class WifiDiagnosis {

	public static void main(String[] args) {
		
		String decision = ("Did that fix the problem? (yes or no)");
		String Re = ("Reboot the computer and try to connect");
		String d = ("Done");
		String in = ("Invaild answer; please try again");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("If you have a problem with internet connectivity this WiFi Diagnosis might work.\n");
		
		System.out.println(Re);
		System.out.println(decision);
		String choice = sc.nextLine();
		while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
		{
			System.out.println(in);
			System.out.println("Programmer: Christopher Newman");
			System.exit(0);
			
			
		}
		
		if(choice.equalsIgnoreCase("yes")) 
		{
			System.out.println(d);
			System.out.println("Programmer: Christopher Newman");
			return;
		}
		
		if(choice.equalsIgnoreCase("no"))
		{
			System.out.println(Re);
			System.out.println(decision);
			choice = sc.nextLine();
			
			while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
			{
				System.out.println(in);
				System.out.println("Programmer: Christopher Newman");
				System.exit(0);
			}
			
		if(choice.equalsIgnoreCase("yes"))
			{
				System.out.println(d);
				System.out.println("Programmer: Christopher Newman");
				return;
			}
			
			if(choice.equalsIgnoreCase("no"))
			{
				System.out.println("Make sure the cables connecting the router are fimly plugged in and the power is getting to the router");
				System.out.println(decision);
				choice = sc.nextLine();
				while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
				{
					System.out.println(in);
					System.out.println("Programmer: Christopher Newman");
					System.exit(0);
				}
				
					if(choice.equalsIgnoreCase("yes"))
					{
						System.out.println(d);
						System.out.println("Programmer: Christopher Newman");
						return;
					}
					
					if(choice.equalsIgnoreCase("no"))
					{
						System.out.println("Move the computer closer to the router and try to connect");
						System.out.println(decision);
						choice = sc.nextLine();
						while(!choice.equalsIgnoreCase("yes") && !choice.equalsIgnoreCase("no"))
						{
							System.out.println(in);
							System.out.println("Programmer: Christopher Newman");
							System.exit(0);
						}
						
							if(choice.equalsIgnoreCase("yes"))
							{
								System.out.println(d);
								System.out.println("Programmer: Christopher Newman");
								return;
							}
							
							if(choice.equalsIgnoreCase("no"))
							{
								System.out.println("Contact your ISP\n");
								System.out.println(d);
							}
							System.out.println("Programmer: Christopher Newman");
					}
			}
		}

	}
}

		
			
		
		
	


