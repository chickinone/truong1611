package student_management;

import java.util.ArrayList;
import java.util.Scanner;

public class Class_schedule extends Grade_and_achievements{
    private String name1;
    private String time;
    ArrayList<Class_schedule> activity = new ArrayList<>();
    Grade_and_achievements grade;

    public Class_schedule(String name1, String time, Grade_and_achievements grade) {
        this.name1 = name1;
        this.time = time;
        this.grade = grade;
    }

    public String getName1() {
        return name1;
    }

    public String getTime1() {
        return time;
    }

    

    public void enterClass() {
    	grade = new Grade_and_achievements();
        grade.enterGrade();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of activities: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter activity name:");
            String name1 = sc.nextLine();
            System.out.println("Enter activity time:");
            String time = sc.nextLine();
            Class_schedule activityItem = new Class_schedule(name1, time, grade);
            activity.add(activityItem);
        }
    }
    public void display() {
    	grade.toString();
    	for(Class_schedule i : activity) {
    		System.out.println("Name activity: " + i.getName());
    		System.out.println("Time activity: " + i.getTime1());
    	}
    }
    
    
    
    
}
