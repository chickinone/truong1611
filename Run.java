package student_management;
import java.util.Scanner;
import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Grade_and_achievements> students = new ArrayList<>();
        students.add(new Grade_and_achievements("Truong", "2005-05-10", "Class A", "123456789", 8.5f, 9.0f, 85.0f, 87.0f));
        students.add(new Grade_and_achievements("Quy", "2004-08-15", "Class B", "987654321", 7.8f, 8.5f, 80.0f, 84.0f));
        students.add(new Grade_and_achievements("Son", "2003-12-20", "Class C", "456789123", 9.2f, 9.8f, 88.0f, 92.0f));
        students.add(new Grade_and_achievements("Tien", "2006-02-25", "Class A", "321654987", 8.0f, 7.5f, 82.0f, 79.0f));
        students.add(new Grade_and_achievements("Quyen", "2005-11-05", "Class B", "789123456", 7.0f, 8.0f, 75.0f, 78.0f));

        ArrayList<Class_schedule> classSchedules = new ArrayList<>();
        String[] times = {"Monday 9:00 AM", "Tuesday 10:00 AM", "Wednesday 11:00 AM", "Thursday 1:00 PM", "Friday 2:00 PM"};
        int timeIndex = 0;

        for (Grade_and_achievements student : students) {
            Class_schedule classSchedule = new Class_schedule("Math", times[timeIndex], student);
            classSchedules.add(classSchedule);
            timeIndex = (timeIndex + 1) % times.length; 
        }
        System.out.println("Bạn muốn làm gì: ");
        System.out.println("1: Tìm kiếm học sinh: ");
        System.out.println("2: Trao đổi với giáo viên ");
        System.out.println("3: Xem lịch học của sinh viên: ");
        System.out.println("4: Nhận thông báo từ nhà trường");
        int n = sc.nextInt();
        // Tìm kiếm học sinh
        if(n == 1) {
        	sc.nextLine();
        	System.out.println("Nhập tên học sinh bạn cần tìm ");
        	String namestudent = sc.nextLine();
        	for( Grade_and_achievements a: students) {
        		if(a.getName().equals(namestudent)) {
        			System.out.println(a.toString());
        		}
        	}
            
        }
        //Nhắn tin cho giáo viên: 
        else if(n == 2) {
        	sc.nextLine();
            teachers_parents messageManager = new teachers_parents();
            System.out.println("Bạn muốn nhắn gì cho giáo viên: ");
            String a = sc.nextLine();
            messageManager.sendMessageFromParent(a);
            System.out.println("Tin nhắn của bạn đã được gửi đến giáo viên ");
        }

        //Xem lịch học của sinh viên
        else if (n == 3) {
        	sc.nextLine();
            System.out.println("Nhập tên sinh viên bạn cần xem lịch học: ");
            String namestudents = sc.nextLine();
            for (Grade_and_achievements a : students) {
                if (a.getName().equals(namestudents)) {
                    System.out.println("Student: " + a.getName());
                    for (Class_schedule schedule : classSchedules) {
                        if (schedule.grade.getName().equals(namestudents)) {
                            System.out.println("Class schedule: " + schedule.getName1() + " - " + schedule.getTime1());
                        }
                    }
                }
            }
        }
        else if (n == 4) {
        	sc.nextLine();
            System.out.println("Nhập thông báo bạn muốn gửi đến học sinh: ");
            String message = sc.nextLine();
            for (Grade_and_achievements student : students) {
                System.out.println("Thông báo đã gửi đến " + student.getName() + ": " + message);
            }
        }
    } 
}

    
