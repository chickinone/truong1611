package student_management;

import java.util.ArrayList;

public class teachers_parents  {
    private ArrayList<String> messages; 

    public teachers_parents() {
        this.messages = new ArrayList<>();
    }


    public void sendMessageFromTeacher(String message) {
        messages.add("From teacher: " + message);
    }


    public void sendMessageFromParent(String message) {
        messages.add("From parent: " + message);
    }

    public void displayMessages() {
        System.out.println("Messages:");
        for (String message : messages) {
            System.out.println(message);
        }
    }
}
