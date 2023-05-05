import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ExpenseTracker extends JFrame implements ActionListener {
    
    private JLabel lblDate, lblAmount, lblCategory, lblDescription;
    private JTextField txtDate, txtAmount, txtDescription;
    private JComboBox<String> cmbCategory;
    private JButton btnAddExpense, btnViewExpenses;
    private static int userId;

    public ExpenseTracker(int userId) {
        ExpenseTracker.userId = userId;

        // Initialize GUI components
        lblDate = new JLabel("Date:");
        lblAmount = new JLabel("Amount:");
        lblCategory = new JLabel("Category:");
        lblDescription = new JLabel("Description:");
        txtDate = new JTextField(10);
        txtAmount = new JTextField(10);
        txtDescription = new JTextField(10);
        cmbCategory = new JComboBox<String>(new String[]{"Food", "Clothes", "Shopping", "Others"});
        btnAddExpense = new JButton("Add Expense");
        btnViewExpenses = new JButton("View Expenses");
        
        // Add components to the frame
        JPanel panel = new JPanel(new GridLayout(5, 2));
        panel.add(lblDate);
        panel.add(txtDate);
        panel.add(lblAmount);
        panel.add(txtAmount);
        panel.add(lblCategory);
        panel.add(cmbCategory);
        panel.add(lblDescription);
        panel.add(txtDescription);
        panel.add(btnAddExpense);
        panel.add(btnViewExpenses);
        add(panel);
        
        // Add action listeners to the buttons
        btnAddExpense.addActionListener(this);
        btnViewExpenses.addActionListener(this);
        
        // Set frame properties
        setTitle("Expense Tracker");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddExpense) {
            // Get the input values
            int userId = 2;
            String date = txtDate.getText();
            double amount = Double.parseDouble(txtAmount.getText());
            String category = (String) cmbCategory.getSelectedItem();
            String description = txtDescription.getText();
            
            // Insert the expense into the database
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/etracker", "root", "root");
                PreparedStatement stmt = con.prepareStatement("INSERT INTO expenses (expenseId, date, amount, category, description) VALUES (?, ?, ?, ?, ?)");
                stmt.setInt(1, userId);
                stmt.setString(2, date);
                stmt.setDouble(3, amount);
                stmt.setString(4, category);
                stmt.setString(5, description);
                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Expense added successfully!");
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to add expense.");
                }
                con.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else if (e.getSource() == btnViewExpenses) {
            // Show the list of expenses
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/etracker", "root", "root");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT expenses.expenseId, expenses.date, expenses.amount, expenses.category, expenses.description from expenses join users on expenses.expenseId = users.userId where userId =?");
                String expenses = "";
                while (rs.next()) {
                    expenses += rs.getString("date") + " | " + rs.getDouble("amount") + " | " + rs.getString("category") + " | " + rs.getString("description") + "\n";
                }
                JOptionPane.showMessageDialog(this, expenses);
                con.close();
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void main(String[] args) {
        new ExpenseTracker(userId);
    }
}
