import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyLogBook extends JFrame {
    private JTextArea inputField;
    private JTextField logArea;
    private JButton addButton;

    public MyLogBook (){
        setTitle("min Loggbok");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10 ));

        logArea = new JTextField();
        logArea.setEditable(false);
        JScrollPane JscrollPane = new JScrollPane(logArea);
        add(JscrollPane, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new FlowLayout());
        inputField = new JTextArea(15);
        addButton = new JButton("Lägg till");

        bottomPanel.add(inputField);
        bottomPanel.add(addButton);
        add(bottomPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addLogEntry());

        inputField.addAncestorListener(e -> {
            return addLogEntry();



    }

    private void addLogEntry(){
        String text = inputField.getText().trim();

        if(text.isEmpty()) {
            JOptionPane.showMessageDialog(this, "skriv in en text innan du klickar", "varning", JOptionPane.WARNING_MESSAGE);
            inputField.setText("");
            inputField.requestFocus();
            return;

        }
        logArea.append(text + "/n");

        inputField.setText("");
        inputField.requestFocus();
    }


public static void main (String[] args){
        SwingUtilities.invokeLater(() -> new MyLogBook().setVisible(true));

}


}







