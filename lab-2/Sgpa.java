import java.util.Scanner;
class Subject{
	int subjectMarks;
	int credits;
	int grades;
}
class Student{
	Subject[] subject;
	String name;
	String usn;
	double SGPA;
	Scanner s;
	Student(){
		int i;
		subject = new Subject[7];
		for(i=0;i<7;i++){
			subject[i] = new Subject();
		}
		s = new Scanner(System.in);
	}
	void getStudentDetails(){
		this.name = s.nextLine();
		this.usn = s.nextLine();
	}
 	void getMarks(){
		int i;
		for(i=0;i<7;i++){
			System.out.println("enter the marks of subject " + i+1);
			subject[i].subjectMarks = s.nextInt();
			System.out.println("enter the credits of subject " + i+1);
			subject[i].credits = s.nextInt();
                	if(subject[i].subjectMarks <= 100 && subject[i].subjectMarks > 90){
				System.out.println("S grade");
				subject[i].grades = 10;
			}else if(subject[i].subjectMarks <= 90 && subject[i].subjectMarks > 80){
				System.out.println("A+ grade");
				subject[i].grades = 9;
			}else if(subject[i].subjectMarks <= 80 && subject[i].subjectMarks > 70){
				System.out.println("A grade");
				subject[i].grades = 8;
			}else if(subject[i].subjectMarks <= 70 && subject[i].subjectMarks > 60){
				System.out.println("B+ grade");
				subject[i].grades = 7;
			}else if(subject[i].subjectMarks <= 60 && subject[i].subjectMarks > 60){
				System.out.println("B grade");
				subject[i].grades = 6;
			}else if(subject[i].subjectMarks <= 50 && subject[i].subjectMarks > 40){
				System.out.println("C+ grade");
          			subject[i].grades = 5;
			}else{
				System.out.println("F grade");
				subject[i].grades = 0;
			}
		}
		
	}
	void computeSGPA(){
		 double totalCredits = 0.0;
     		 double weightedSum = 0.0;

        	for (int i = 0; i < 7; i++) {
            		totalCredits += subject[i].credits;
            		weightedSum += subject[i].grades * subject[i].credits;
        	}

       		SGPA = weightedSum / totalCredits;
    		
	}

}

class Sgpa{
	public static void main(String args[]){
		Student n = new Student();
		
		n.getStudentDetails();
		n.getMarks();
		n.computeSGPA();

		System.out.println("\nStudent Details:");
        	System.out.println("Name: " + n.name);
        	System.out.println("USN: " + n.usn);
        	System.out.println("SGPA: " + n.SGPA);
	}	

}