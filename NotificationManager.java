package student_management;

public class NotificationManager {
    public void sendNotificationToParents(String message) {
        System.out.println("Notification sent to parents: " + message);
    }

    public void sendNotificationToStudents(String message) {
        System.out.println("Notification sent to students: " + message);
    }

    public void sendNotificationToBoth(String message) {
        sendNotificationToParents(message);
        sendNotificationToStudents(message);
    }
}
