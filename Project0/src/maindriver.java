import java.util.Scanner;




public class maindriver {
	
	public static void welcomeMessage(Scanner scanner, AuthenticationService as) {
		System.out.println("Hello, Welcome to Bank of Java.");
		System.out.println("Please enter a option below:");
		System.out.println("");
		
	
	}

	public static void menuOptions() {
		System.out.println("Existing Customer Login [E]");
		System.out.println("Open A New Account [N]");
		System.out.println("Employee Portal [EE]");
		System.out.println("Quit Program? [Q]");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	
			
			welcomeMessage(scanner, as);
			
			boolean c = true;
			while(c) {
				menuOptions();
				String input= scanner.nextLine();
				
				switch(input) {
				case "E":
					
					break;
					
				case "N":
			
					
					break;
				case "EE":
				
					break;
					
				case "Q":
					System.out.println("Quitting program"+ "\n");
					c = false;
					break;
					
				default:
					System.out.println("Invalid Option. Please try again.");
			}
			}
			
			
			
			
			
		}

	}

}
