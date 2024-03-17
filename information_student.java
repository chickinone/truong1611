package student_management;
import java.util.Scanner;
public class information_student {
	private String name;
	private String birth;
	private String clas1;
	private String numberphone;
	
	public information_student() {
		
	}
	
	public information_student(String name,String birth, String clas1,String numberphone) {
		this.name = name;
		this.birth = birth;
		this.clas1 = clas1;
		this.numberphone = numberphone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getClas1() {
		return clas1;
	}

	public void setClas1(String clas1) {
		this.clas1 = clas1;
	}

	public String getNumberphone() {
		return numberphone;
	}

	public void setNumberphone(String numberphone) {
		this.numberphone = numberphone;
	}
	
	public static void enterinfor() {
		Scanner sc = new Scanner(System.in);
		information_student student = new information_student();
		System.out.println("Enter name: ");
		student.name = sc.nextLine();
		System.out.println("ENter birth: ");
		student.birth = sc.nextLine();
		System.out.println("ENter class1");
		student.clas1 = sc.nextLine();
		System.out.println("Enter the numberphone: ");
		student.numberphone = sc.nextLine();
	}
	@Override
	public String toString() {
		return "information_student [name=" + name + ", birth=" + birth + ", clas1=" + clas1 + ", numberphone="
				+ numberphone + "]";
	}
	
	
	
	
	
}
