import javax.swing.*;
import java.awt.event.*;

public class Deposit extends JFrame {
    JTextField accNoField, amountField;

    public Deposit() {
        setTitle("Deposit Money");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel accNoLabel = new JLabel("Account No:");
        JLabel amountLabel = new JLabel("Amount:");

        accNoField = new JTextField();
        amountField = new JTextField();
        JButton depositBtn = new JButton("Deposit");

        accNoLabel.setBounds(30, 30, 100, 25);
        accNoField.setBounds(150, 30, 150, 25);
        amountLabel.setBounds(30, 70, 100, 25);
        amountField.setBounds(150, 70, 150, 25);
        depositBtn.setBounds(100, 110, 100, 30);

        add(accNoLabel);
        add(accNoField);
        add(amountLabel);
        add(amountField);
        add(depositBtn);

        depositBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int accNo = Integer.parseInt(accNoField.getText());
                    double amount = Double.parseDouble(amountField.getText());
                    Account acc = BankData.getAccount(accNo);
                    if (acc != null) {
                        acc.deposit(amount);
                        BankData.updateAccount(acc);
                        JOptionPane.showMessageDialog(null, "Amount Deposited Successfully!\nNew Balance: ₹" + acc.getBalance());
                        dispose();
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