import java.util.Scanner;

public class Student {
		String name;
		int id;
		int sclass;
		int sub1;
		int sub2;
		int sub3;
		float percentage;
		int total;
		int val;
		void disp(){
			System.out.println("Name is : " +name);
			System.out.println("Id is : " +id);
			System.out.println("Student class : " +sclass);
			System.out.println("Subject 1 marks : "+sub1);
			System.out.println("Subject 2 marks : "+sub2);
			System.out.println("Subject 3 marks : "+sub3);

		}
		

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		do {
			System.out.println("Enter your Choice");
			System.out.println("1. Student Details \n 2. Total Marks \n 3. Percentage \n 4. Check Eligible \n 5. Exit");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("Enter the name");
				stu.name=sc.next();
				sc.nextLine();
				System.out.println("Enter your ID");
				stu.id=sc.nextInt();
				System.out.println("Enter class");
				stu.sclass=sc.nextInt();
				System.out.println("Enter your sub1 marks");
				stu.sub1=sc.nextInt();
				System.out.println("Enter your sub2 marks");
				stu.sub2=sc.nextInt();
				System.out.println("Enter your sub3 marks");
				stu.sub3=sc.nextInt();
				stu.disp();
			}
			else if(choice==2) {
				stu.total=stu.sub1+stu.sub2+stu.sub3;
				System.out.println(" The Total marks Obtained is : "+stu.total);
			}
			else if(choice==3) {
				stu.percentage = (float)stu.total/150*100;
				System.out.println("The Percentage Obtained is : "+stu.percentage);
			}
			else if(choice==4) {
				if(stu.percentage<35) {
					System.out.println("Student Cannot moved from class "+stu.sclass);
				}
				else {
					System.out.println("Student passed from class "+stu.sclass);
				}
			}
			else if(choice==5) {
				return;
			}
			else {
				System.out.println("Invalid input");
			}
		}while(true);
	}

}
