import java.util.Scanner;

public class Kiosk {
	int p_cappuccino= 150;
	int p_espresso= 100;
	int p_americano=200;
	int p_ginger_tea=50;
	int p_cardamon_tea=100;
	int p_masala_tea=130;
	int  p_Puneri_elaichi_tea=180;
	int p_sandwich_combo = 300;
	int p_burger_combo= 250;
	int p_bread_toast_combo=350;
	int p_samosa_combo = 300;
	int price1,price2,price3,price4,price5,price6,price7,price8,price9,price10,price11;
	int bill=0;
	int total1=0, total2=0,total3=0;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Kiosk k = new Kiosk();
		do {
			System.out.println("Wlecome to Kiosk ");
			System.out.println("1. order Coffee\n"
					+ "2. Order Tea \n"
					+ "3. Order Brunch Combo \n"
					+"4. Make Payment \n"
					+"5. Exit");
			System.out.println("Enter what would you like to order");
			int choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Which coffee would you like to order");
				System.out.println("1.1 Cappuccino \n"
						+"1.2 Espresso\n"
						+"1.3 Americano\n");
				System.out.println("How many coffees would you like to order");
				int n=sc.nextInt();
				System.out.println("Enter the order");
				for(int i=0;i<n;i++)
				{
					double ch=sc.nextDouble();
					if(ch==1.1)
					{
						k.price1=k.p_cappuccino;
					}
					else if(ch==1.2)
					{
						k.price2=k.p_espresso;
					}
					else if(ch==1.3)
					{
						k.price3=k.p_americano;
					}
					else
					{
						System.out.println("Invalid Input");
						break;
					}
					k.total1=k.price1+k.price2+k.price3;
				}
				System.out.println("Total price for your Coffee is " +k.total1);		
			}
			else if(choice==2)
			{
				System.out.println("Which Tea would you like to order");
				System.out.println("2.1 Ginger Tea \n"
						+"2.2 Cardamon Tea \n"
						+"2.3 Masala Tea\n"
						+"2.4 Puneri Elaichi Tea");
				System.out.println("How many Teas would you like to order");
				int n=sc.nextInt();
				System.out.println("Enter the order");
				for(int i=0;i<n;i++)
				{
					double ch=sc.nextDouble();
					if(ch==2.1)
					{
						k.price4=k.p_ginger_tea;
					}
					else if(ch==2.2)
					{
						k.price5=k.p_cardamon_tea;
					}
					else if(ch==2.3)
					{
						k.price6=k.p_masala_tea;
					}
					else if(ch==2.4)
					{
						k.price7=k.p_Puneri_elaichi_tea;
					}
					else
					{
						System.out.println("Invalid Input");
					}
					k.total2=k.price4+k.price5+k.price6+k.price7;
				}
				System.out.println("Total price for your Tea is " +k.total2);		
			}
			else if(choice==3)
			{
				System.out.println("Which Combo would you like to order");
				System.out.println("3.1 Sandwitch Combo \n"
						+"3.2 Burger Combo \n"
						+"3.3 Bread Toast Combo \n"
						+"3.4 Samosa Combo");
				System.out.println("How many Combo would you like to order");
				int n=sc.nextInt();
				System.out.println("Enter the order");
				for(int i=0;i<n;i++)
				{
					double ch=sc.nextDouble();
					if(ch==3.1)
					{
						k.price8=k.p_sandwich_combo;
					}
					else if(ch==3.2)
					{
						k.price9=k.p_burger_combo;
					}
					else if(ch==3.3)
					{
						k.price10=k.p_bread_toast_combo;
					}
					else if(ch==3.4)
					{
						k.price11=k.p_samosa_combo;
					}
					else
					{
						System.out.println("Invalid Input");
					}
					k.total3=k.price8+k.price9+k.price10+k.price11;
				}
				System.out.println("Total price for your Combo is " +k.total3);		
			}
			else if(choice==4)
			{
				System.out.println("Make Payment here");
				k.bill=k.total1+k.total2+k.total3;
				System.out.println(" The Total Amount is "+k.bill);
				System.out.println("Thanks for ordering");
				
			}
			else if(choice==5)
			{
				return;
			}
			else 
			{
				System.out.println("Invalid Choice");
			}
		}while(true);
	}

}
