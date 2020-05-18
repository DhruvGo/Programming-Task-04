package programmingtask04;
import java.util.Scanner ;
public class coursemain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x ; // number of courses
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of courses required.");
		x = input.nextInt();
		while (!(x<= 6 && x >=1)) {
			System.out.println("Re-enter the number of courses, the value cannot be over 6.");
			x = input.nextInt();
		}
		
		course[] GPA = new course [x];//creates array for object GPA with length of how many courses user takes
		Scanner GPA2 = new Scanner(System.in);
		Scanner GPA3 = new Scanner(System.in);
		
		String n;
		int m;
		
		for(int i = 0; i <= x-1; i++) {//loops through statements below depending on how many courses are taken
			System.out.println("Enter the name of the course studying" +i+ "\n" );
			n = GPA2.nextLine();
			System.out.println("Enter the mark " + n + "\n");
			m = GPA3.nextInt();
			
			GPA[i] = new course(n,m); // constructor	//Stores user information in the GPA object array	
		}
		
		int average = 0;
		for(int i = 0;  i<=x-1 ; i++) {

			average += GPA[i].mark;
		}
			average = average/x;
			
			if( average < 50) {
				System.out.println("You failed! Your course average was" +average);
			}
			else if( average > 80) {
				System.out.println("Passed with honors, your course average was"+ average);
			}
			else {
				System.out.println("You passed your average of the total courses was"+ average);
			}
		
		
	}

}
