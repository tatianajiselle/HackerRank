import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

/* My Code */
class Student extends Person{
    private int[] testScores;
    
    Student(String firstName,String lastName,int identification,int[]testScores){
        super(firstName,lastName,identification); // because these are inherited we use super
        this.testScores=testScores;
    }	
    public String calculate(){
        float total=0.0f;
        for(int i=0;i<testScores.length;i++){
            total=total+testScores[i];
        }
        String str="";
        float average=total/(testScores.length);
        if(average>=90 && average<=100)
            str= "O";
        else if(average>=80 && average<90)
            str= "E";
        else if(average>=70 && average<80)
            str= "A";
        else if(average>=55 && average<70)
            str= "P";
        else if(average>=40 && average<55)
            str= "D";
        else if(average<40)
            str= "T";

        return str;
    
    }
}
/* End of my code */

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}