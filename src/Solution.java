import java.util.Scanner;

public class Solution {
	boolean primenum(int n)
	{
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	void print(int n) {
		for (int i = 2; i <= n; i++) {
			if (primenum(i)) {
				System.out.println(i);
			}
		}
		}
	
	void oddnum(int n)
	{
		for( int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
	
	int emirp(int num)
	
	{
		int rem=0;
		while(num>0)
		{
			int digit = num%10;
			rem=rem*10+digit;
			num=num/10;
		}
	 return rem;
	}

	public static void main(String[] args) {
	
		Solution s= new Solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		do {
		System.out.println("1. Prime Number \n2. Odd Number \n3.Emirp Number");
		int ch= sc.nextInt();
		switch(ch)
		{
		case 1: s.print(n);
		break;
		case 2: s.oddnum(n);
		break;
		case 3: 
			System.out.println("Enter a number");
			int num=sc.nextInt();
			int reversed = s.emirp(num);
		if (s.primenum(num) && s.primenum(reversed) && num != reversed) {
			System.out.println(num + " is an Emirp number.");
		} else {
			System.out.println(num + " is not an Emirp number.");
		}
		break;
		default : System.out.println("Invalid Output");
		}
			
		}while(true);
	}

}
