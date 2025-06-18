import javax.swing.*;
import java.awt.event.*;

public class CheckBalance extends JFrame {
    JTextField accNoField;

    public CheckBalance() {
        setTitle("Check Balance");
        setSize(350, 180);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel accNoLabel = new JLabel("Account No:");
        accNoField = new JTextField();
        JButton checkBtn = new JButton("Check");

        accNoLabel.setBounds(30, 30, 100, 25);
        accNoField.setBounds(150, 30, 150, 25);
        checkBtn.setBounds(100, 80, 100, 30);

        add(accNoLabel);
        add(accNoField);
        add(checkBtn);

        checkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int accNo = Integer.parseInt(accNoField.getText());
                    Account acc = BankData.getAccount(accNo);
                    if (acc != null) {
                        JOptionPane.showMessageDialog(null, "Account Holder: " + acc.getName() + "\nBalance: ₹" + acc.getBalance());
                    } else {
                        JOptionPane.showMessageDialog(null, "Account not found!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input!");
                }
            }
        });

        setVisible(true);
    }
}