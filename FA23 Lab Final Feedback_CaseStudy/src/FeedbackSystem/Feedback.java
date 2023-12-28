package FeedbackSystem;

import FeedbackSystem.State.FeedbackState;

import java.util.Scanner;

public abstract class Feedback {
    protected FeedbackState state;
    protected Scanner scanner=new Scanner(System.in);
    public abstract String collectFeedback();

    public void setState(FeedbackState state) {
        this.state = state;
    }

    public FeedbackState getState() {
        return state;
    }
}
