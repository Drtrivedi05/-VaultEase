import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JFrame {

    public MainMenu() {
        setTitle("Banking System");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JButton createBtn = new JButton("Create Account");
        JButton depositBtn = new JButton("Deposit");
        JButton withdrawBtn = new JButton("Withdraw");
        JButton checkBalanceBtn = new JButton("Check Balance");

        createBtn.setBounds(50, 30, 200, 30);
        depositBtn.setBounds(50, 70, 200, 30);
        withdrawBtn.setBounds(50, 110, 200, 30);
        checkBalanceBtn.setBounds(50, 150, 200, 30);

        add(createBtn);
        add(depositBtn);
        add(withdrawBtn);
        add(checkBalanceBtn);

        createBtn.addActionListener(e -> new CreateAccount());
        depositBtn.addActionListener(e -> new Deposit());
        withdrawBtn.addActionListener(e -> new Withdraw());
        checkBalanceBtn.addActionListener(e -> new CheckBalance());

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}