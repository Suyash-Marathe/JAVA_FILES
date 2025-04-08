import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Awt {

    public static void main(String[] args) {
        
        JFrame f = new JFrame("User Form");
        f.setVisible(true);
        f.setSize(400, 400);
        f.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Username : ");
        f.add(l1);

        JTextField t1 = new JTextField(10);
        f.add(t1);
        
        JButton b1 = new JButton("Submit");
        f.add(b1);

        b1.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {

                String uname = t1.getText();
                JOptionPane.showMessageDialog(f, "Welcome " + uname );
            }
        });
    }
}

