package FeedbackSystem;

import FeedbackSystem.State.InProgressState;
import FeedbackSystem.State.NewState;

public class Poll extends Feedback {
    String[] pollQuestions = {
            "How easy was it to understand the admission process?",
            "Did you receive adequate guidance during the admission process?",
            "How would you rate the efficiency of the admission process?",
            "Were all your queries regarding admission promptly and effectively addressed?",
            "Would you recommend our institution to others based on the admission process?",
            "What improvements would you suggest for the admission process?"
    };

    public Poll() {
        this.setState(new NewState());
    }

    @Override
    public String collectFeedback() {
        StringBuilder response = new StringBuilder();
        this.setState(new InProgressState());
        System.out.println("Collecting feedback for Poll");
        System.out.println("Please answer the following questions on a scale of 1-5");
        int i = 0, pollQuestionsLength = pollQuestions.length;
        while (i < pollQuestionsLength) {
            String question = pollQuestions[i];
            System.out.println(question);
            response.append(question);
            int rating = scanner.nextInt();
            if (rating < 1 || rating > 5) {
                System.out.println("Invalid rating. Please enter a rating between 1 and 5");
                continue;
            }
            response.append(": ").append(rating).append("\n");
            i++;
        }
        return response.toString();
    }
}
