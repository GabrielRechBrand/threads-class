import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiThread extends JFrame {

    private JButton button;

    public MultiThread() {
        super("Multithread Application");

        System.out.println("Active threads here: " + Thread.activeCount());

        button = new JButton("Button");
        this.getContentPane().add(button);
        this.pack();

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog(null, "Pressed the button");
            }
        });
    }

}
