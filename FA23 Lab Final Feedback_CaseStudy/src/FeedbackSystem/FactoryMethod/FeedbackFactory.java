package FeedbackSystem.FactoryMethod;

import FeedbackSystem.DirectContact;
import FeedbackSystem.Feedback;
import FeedbackSystem.Poll;
import FeedbackSystem.Survey;

public class FeedbackFactory {

    public Feedback createFeedback(String type) {
        return switch (type) {
            case "POLL" -> new Poll();
            case "DIRECTCONTACT" -> new DirectContact();
            case "SURVEY" -> new Survey();
            default -> null;
        };
    }
}
