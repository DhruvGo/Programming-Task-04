package programmingtask04;

public class course {

	String Name;
	int mark;
	
	public course(String n, int m) {
		this.Name = n;
		this.mark = m;// constructor variables equal to the variable created above
	}

	public void printdetails() { // method that prints the user inputed mark and course to the command line 
		System.out.println(this.Name);
		System.out.println(this.mark);
		System.out.println("\n");	
	}
}
