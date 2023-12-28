package FeedbackSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FeedbackSystem feedbackSystem = new FeedbackSystem();
        while(true) {
            try {
                System.out.println("Please enter your name: ");
                String name = scanner.nextLine();
                System.out.println("Please enter your email: ");
                String email = scanner.nextLine();
                System.out.println("Please enter your feedback type[`Poll`,`Survey`,`DirectContact`]: ");
                String type = scanner.nextLine();
                if(!type.equalsIgnoreCase("Poll") && !type.equalsIgnoreCase("Survey") && !type.equalsIgnoreCase("DirectContact")) {
                    System.out.println("Invalid feedback type");
                    continue;
                }
                type = type.toUpperCase();
                feedbackSystem.createFeedback(type);
                String feedbackResponse = feedbackSystem.processFeedback(type);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Feedback:\n" + feedbackResponse);
                System.out.println("Do you want to continue? (y/n)");
                String choice = scanner.nextLine();
                if(choice.equalsIgnoreCase("n")) {
                    break;
                }
            }catch (Exception e) {
                System.out.println("Input Error: "+e.getMessage());
            }
        }
    }
}
