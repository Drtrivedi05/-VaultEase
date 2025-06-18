import javax.swing.*;
import java.awt.event.*;

public class CreateAccount extends JFrame {

    JTextField accNoField, nameField, balanceField;

    public CreateAccount() {
        setTitle("Create New Account");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        JLabel accNoLabel = new JLabel("Account No:");
        JLabel nameLabel = new JLabel("Name:");
        JLabel balanceLabel = new JLabel("Initial Balance:");

        accNoField = new JTextField();
        nameField = new JTextField();
        balanceField = new JTextField();

        JButton createBtn = new JButton("Create");

        accNoLabel.setBounds(30, 20, 100, 25);
        accNoField.setBounds(150, 20, 150, 25);
        nameLabel.setBounds(30, 60, 100, 25);
        nameField.setBounds(150, 60, 150, 25);
        balanceLabel.setBounds(30, 100, 100, 25);
        balanceField.setBounds(150, 100, 150, 25);
        createBtn.setBounds(100, 150, 100, 30);

        add(accNoLabel);
        add(accNoField);
        add(nameLabel);
        add(nameField);
        add(balanceLabel);
        add(balanceField);
        add(createBtn);

        createBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int accNo = Integer.parseInt(accNoField.getText());
                    String name = nameField.getText();
                    double balance = Double.parseDouble(balanceField.getText());
                    Account acc = new Account(accNo, name, balance);
                    boolean saved = BankData.saveAccount(acc);
                    if (saved) {
                        JOptionPane.showMessageDialog(null, "Account Created Successfully!");
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Account Already Exists!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input! Please try again.");
                }
            }
        });

        setVisible(true);
    }
}