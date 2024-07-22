import java.util.Scanner;

interface FlightAvailability
{

	abstract void check();
}  

class Airasia implements FlightAvailability 
{   
	int seat=30;
	public void check()
	{
	   	       System.out.println("Welcome to Airasia");
	}
}

class SpiceJet
{
	int seat=40;
	public void check()
	{
	System.out.println("Welcome to SpiceJet");
	}
}

class Indigo
{ 
	int seat=50;
	public void check()
	{
	System.out.println("Welcome to Indigo");
	}
}

public class FlightBooking
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Airasia a= new Airasia();
		SpiceJet s = new SpiceJet();
		Indigo i=new Indigo();
		while (true)
		{
		System.out.println("Enter your choice");
        System.out.println("1.Airasia");
		System.out.println("2.SpiceJet ");
		System.out.println("3.Indigo ");
		System.out.println("4.Exit");
		System.out.println();
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				a.check();
				System.out.println(a.seat + " seat Booking Available in Airasia");
				System.out.println();
			    System.out.println("Enter seats required");
				int book = sc.nextInt();
				if(book<=a.seat)
				{
				System.out.println(book + " Seats Booked Succesfully");
				a.seat=a.seat-book;
				System.out.println("Remaining Seats = " + (a.seat));
				}
				else
				{
					System.out.println("Insuffcient Seats: Only "+a.seat + " Seats Booked Succesfully");
				System.out.println("All seats are booked");
				System.out.println("Sorry for Inconvience Please stay connected to get Notification about seats availability");
				}
			    
				break;
				
		    case 2:
		    	s.check();
				System.out.println(s.seat + " seat Booking Available in SpiceJet");
				System.out.println();
			    System.out.println("Enter seats required");
				int book1 = sc.nextInt();
				if(book1<=s.seat)
				{
				System.out.println(book1 + " Seats Booked Succesfully");
				s.seat=s.seat-book1;
				System.out.println("Remaining Seats = " + (s.seat));
				}
				else
				{
					System.out.println("Insuffcient Seats: Only "+s.seat + " Seats Booked Succesfully");
				System.out.println("All seats are booked");
				System.out.println("Sorry for Inconvience Please stay connected to get Notification about seats availability");
				}
				break;
			case 3:
				i.check();
				System.out.println(i.seat + " seat Booking Available in Indigo");
				System.out.println();
			    System.out.println("Enter seats required");
				int book2 = sc.nextInt();
				if(book2<=i.seat)
				{
				System.out.println(book2 + " Seats Booked Succesfully");
				i.seat=i.seat-book2;
				System.out.println("Remaining Seats = " + (i.seat));
				}
				else
				{
					System.out.println("Insuffcient Seats: Only "+i.seat + " Seats Booked Succesfully");
				System.out.println("All seats are booked");
				System.out.println("Sorry for Inconvience Please stay connected to get Notification about seats availability");
				}
			    break;

			case 4:
				return;
			   
			default:			
			    System.out.println("Invalid choice");
		}

		}
		

		
	}
}
