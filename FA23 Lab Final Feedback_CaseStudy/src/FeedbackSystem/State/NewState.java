package FeedbackSystem.State;

public class NewState implements FeedbackState {

    @Override
    public String handle() {
        return "Feedback is new";
    }
}
