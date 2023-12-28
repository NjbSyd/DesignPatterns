package FeedbackSystem.State;

public class CompletedState implements FeedbackState {
    @Override
    public String handle() {
        return "Feedback is completed";
    }
}
