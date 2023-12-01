package GangOfFour.Command.EditorExample;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();
    private JButton ctrlC, ctrlX, ctrlV, ctrlZ;

    public void init() {
        JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ctrlC = new JButton("Ctrl+C");
        ctrlX = new JButton("Ctrl+X");
        ctrlV = new JButton("Ctrl+V");
        ctrlZ = new JButton("Ctrl+Z");
        Editor editor = this;

        // Inside your init() method, set the initial state:
        ctrlC.setEnabled(false);
        ctrlX.setEnabled(false);

        ctrlC.addActionListener(e -> {
            String selectedText = textField.getSelectedText();
            if (selectedText != null && !selectedText.isEmpty()) {
                executeCommand(new CopyCommand(editor));
            }
        });

        ctrlX.addActionListener(e -> {
            String selectedText = textField.getSelectedText();
            if (selectedText != null && !selectedText.isEmpty()) {
                executeCommand(new CutCommand(editor));
            }
        });
        ctrlV.addActionListener(e -> executeCommand(new PasteCommand(editor)));
        ctrlZ.addActionListener(e -> undo());


        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                System.out.println("insertUpdate");
                updateButtonState();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                System.out.println("removeUpdate");
                updateButtonState();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                System.out.println("changedUpdate");
                updateButtonState();
            }
        });

    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void updateButtonState() {
        if (textField.getText() == null || textField.getText().isEmpty() || textField.getSelectedText() == null || textField.getSelectedText().isEmpty()) {
            ctrlC.setEnabled(false);
            ctrlX.setEnabled(false);
            return;
        }
        ctrlC.setEnabled(true);
        ctrlX.setEnabled(true);
    }

    private void undo() {
        if (history.isEmpty()) return;
        updateButtonState();
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
