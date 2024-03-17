package student_management;
import java.util.Scanner;
public class Grade_and_achievements extends information_student {
	private float grade1;
	private float grade2;
	private float midterm_score;
	private float final_grade;
	private information_student student = new information_student();
	public Grade_and_achievements() {
		
	}
	
	public Grade_and_achievements(String name,String birth, String clas1,String numberphone, float grade1, float grade2, float midterm_score, float final_grade) {
		super(name, birth, clas1, numberphone);
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.midterm_score = midterm_score;
		this.final_grade = final_grade;
	}

	public float getGrade1() {
		return grade1;
	}

	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}

	public float getGrade2() {
		return grade2;
	}

	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}

	public float getMidterm_score() {
		return midterm_score;
	}

	public void setMidterm_score(float midterm_score) {
		this.midterm_score = midterm_score;
	}

	public float getFinal_grade() {
		return final_grade;
	}

	public void setFinal_grade(float final_grade) {
		this.final_grade = final_grade;
	}
	
	public void  enterGrade() {
		
		student.enterinfor();
		Grade_and_achievements grade = new Grade_and_achievements();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter grade1: ");
		grade.grade1 = sc.nextFloat();
		System.out.println("ENter grade2: ");
		grade.grade2 = sc.nextFloat();
		System.out.println("Enter midterm_score: ");
		grade.midterm_score = sc.nextFloat();
		grade.final_grade = (float)(grade.getGrade1() * 0.2 + grade.getGrade2() * 0.3 + grade.getMidterm_score() * 0.5);
	}

	@Override
	public String toString() {
		return "Grade_and_achievements [grade1=" + grade1 + ", grade2=" + grade2 + ", midterm_score=" + midterm_score
				+ ", final_grade=" + final_grade + ", student=" + student.toString() + "]";
	}
	
	
	
	
	
}
