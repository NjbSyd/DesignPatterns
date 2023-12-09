package GangOfFour.State.MediaPlayer.States;

import GangOfFour.State.MediaPlayer.UI.Player;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ActionListeners {
    public static ActionListener getStopActionListener(JButton play, JButton prev, JButton next, JButton stop, JTextField textField, Player player) {
        return e -> {
            String text = player.getState().onLock();
            textField.setText(text);
            play.setText("Play");
            if (text.contains("Locked")) {
                play.setEnabled(false);
                prev.setEnabled(false);
                next.setEnabled(false);
                stop.setText("Reset");
            } else if (text.contains("Ready")) {
                play.setEnabled(true);
                prev.setEnabled(true);
                next.setEnabled(true);
                stop.setText("Lock");
            } else if (text.contains("Stopped")) {
                play.setEnabled(true);
                prev.setEnabled(true);
                next.setEnabled(true);
                stop.setText("Lock");
            }
        };
    }

    public static ActionListener getPlayActionListener(JButton stop, JButton play, JTextField textField, Player player) {
        return e -> {
            String text = player.getState().onPlay();
            textField.setText(text);
            stop.setText("Stop");
            if (text.contains("Paused") || text.contains("Ready")) {
                play.setText("Play");
            } else if (text.contains("Playing")) {
                play.setText("Pause");
            }
        };
    }
}
