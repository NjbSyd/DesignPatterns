package GangOfFour.State.MediaPlayer.UI;

import javax.swing.*;
import java.awt.*;

import static GangOfFour.State.MediaPlayer.States.ActionListeners.getPlayActionListener;
import static GangOfFour.State.MediaPlayer.States.ActionListeners.getStopActionListener;

public class UI {
    private Player player;
    private static JTextField textField = new JTextField();
    private static JButton play = new JButton("Play");
    private static JButton stop = new JButton("Lock");
    private static JButton next = new JButton("Next");
    private static JButton prev = new JButton("Prev");
    private static JLabel label = new JLabel();

    public UI(Player player) {
        this.player = player;
    }

    public void init() {
        JFrame frame = new JFrame("Test player");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(label);
        label.setLabelFor(textField);
        context.add(textField);
        context.add(buttons);
        label.setText("Current state: " + player.getState().getClass().getSimpleName());
        textField.setText("Ready");
        play.addActionListener(getPlayActionListener(stop, play, textField, player));
        stop.addActionListener(getStopActionListener(play, prev, next, stop, textField, player));
        next.addActionListener(e -> textField.setText(player.getState().onNext()));
        prev.addActionListener(e -> textField.setText(player.getState().onPrevious()));
        textField.setEditable(false);
        frame.setBounds(500, 250, 300, 100);
        frame.setVisible(true);
        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);
    }

    public static void LockPlayer() {
        play.setEnabled(false);
        prev.setEnabled(false);
        next.setEnabled(false);
        stop.setText("Reset");
        play.setText("Play");
        textField.setText("Damaged...");
    }
    public static void changeLabelState(String state) {
        label.setText("Current state: " + state);
    }

}


