package FeedbackSystem.Singleton;

import FeedbackSystem.Feedback;

import java.util.HashMap;
import java.util.Map;

public class FeedbackRegistry {
    private Map<String, Feedback> feedbacks;
    private static FeedbackRegistry instance;

    private FeedbackRegistry() {
        feedbacks = new HashMap<>();
    }

    public static FeedbackRegistry getInstance() {
        if (instance == null) {
            instance = new FeedbackRegistry();
        }
        return instance;
    }

    public void registerFeedback(String type, Feedback feedback) {
        feedbacks.put(type, feedback);
    }

    public Feedback getFeedback(String type) {
        return feedbacks.get(type);
    }

}
