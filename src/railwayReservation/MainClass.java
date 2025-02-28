package railwayReservation;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		boolean loop = true;
		
		while(loop) {
			System.out.println("\nChoose any one \n 1.Book Ticket \n 2.Cancel Ticket"
					+ "\n 3.Display Conformed List \n 4.Display RAC List"
					+ "\n 5.Display Waiting List \n 6.Exit");
			Scanner s = new Scanner(System.in);
			int n = s.nextInt();
			
			switch(n) {
			
			case 1:{
				System.out.print("Enter your name : ");
				String name = s.next();
				System.out.print("\nEnter your age : ");
				int age = s.nextInt();
				System.out.print("\nEnter preferred berth : ");
				char preferance = s.next().charAt(0);
				if(preferance == 'U' || preferance == 'M' || preferance == 'L') {
					
				}else {
					System.out.println("Invalid berth\n Valid Preferances are"
							+ "\n U for Upper, M for Middle, L for Lower");
				}
				break;
			}
			
			case 2:{
				System.out.println("Enter your T");
				break;
			}
			
			case 3:{
				break;
			}
			
			case 4:{
				break;
			}
			
			case 5:{
				break;
			}
			
			case 6:{
				System.out.println("\t Thankyou!");
				s.close();
				loop = false;
				break;
			}
			
			}
		}

	}

}
