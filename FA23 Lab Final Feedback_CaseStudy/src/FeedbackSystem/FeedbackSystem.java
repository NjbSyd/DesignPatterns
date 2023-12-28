package FeedbackSystem;

import FeedbackSystem.Facade.FeedbackFacade;
import FeedbackSystem.FactoryMethod.FeedbackFactory;
import FeedbackSystem.Singleton.FeedbackRegistry;

public class FeedbackSystem {
    private FeedbackRegistry feedbackRegistry;
    private FeedbackFactory feedbackFactory;
    private FeedbackFacade feedbackFacade;

    public FeedbackSystem() {
        feedbackRegistry = FeedbackRegistry.getInstance();
        feedbackFactory = new FeedbackFactory();
        feedbackFacade = new FeedbackFacade();
    }

    public void createFeedback(String type) {
        Feedback feedback = feedbackFactory.createFeedback(type);
        feedbackRegistry.registerFeedback(type, feedback);
    }

    public String processFeedback(String type){
        Feedback feedback = feedbackRegistry.getFeedback(type);
        return feedbackFacade.processFeedback(feedback);
    }
}

