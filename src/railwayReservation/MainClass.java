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
			System.out.print("Enter your option : ");
			int option = s.nextInt();
			
			switch(option) {
			
			case 1:{
				System.out.print("\nEnter your name : ");
				String name = s.next();
				System.out.print("Enter your age : ");
				int age = s.nextInt();
				System.out.print("Enter preferred berth (U/M/L): ");
				char preference = s.next().charAt(0);
				if(preference == 'U' || preference == 'M' || preference == 'L') {
					TicketBooking.bookTicket(new Passenger(name,age,preference));
				}else {
					System.out.println("Invalid berth\n Valid Preferances are"
							+ "\n U for Upper, M for Middle, L for Lower");
				}
				break;
			}
			
			case 2:{
				System.out.print("\nEnter your Ticket Id : ");
				int id = s.nextInt();
				System.out.println(TicketCanceling.canceling(id));
				break;
			}
			
			case 3:{
				TicketBooking.displayConfirmed();
				break;
			}
			
			case 4:{
				TicketBooking.displayRAC();
				break;
			}
			
			case 5:{
				TicketBooking.displayWaiting();
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
