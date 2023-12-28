package FeedbackSystem.Facade;

import FeedbackSystem.Feedback;

public class FeedbackFacade {

    public String processFeedback(Feedback feedback) {
        return feedback.collectFeedback();
    }
}
