package swd412_class.activity2;

import javax.swing.*; 
import java.awt.event.*; // Ensure ActionListener and related classes are imported

public class LU7UI_Buttons implements ActionListener {
    
    // Declaring frame, labels, text fields, and button
    JFrame frame1 = new JFrame("Log In");
    JLabel label1, label2;    
    JTextField t1, t2;    
    JButton b1;        
    
    // Constructor to set up the UI components
    LU7UI_Buttons() {        
        // Initializing labels, text fields, and button
        label1 = new JLabel("User Name");
        label2 = new JLabel("Password");
        t1 = new JTextField(40); // Width set to 40 columns (not limiting input length)
        t2 = new JTextField(20); // Width set to 20 columns
        
        // Initializing the OK button
        b1 = new JButton("OK");

        // Setting up the frame
        frame1.setSize(800, 400);
        frame1.setVisible(true);
        frame1.setLayout(null);
        frame1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        // Adding components to the frame
        frame1.add(label1);        
        frame1.add(t1);        
        frame1.add(label2);        
        frame1.add(t2);        
        frame1.getContentPane().add(b1);
        
        // Setting the positions of the components
        label1.setBounds(0, 30, 100, 30);
        t1.setBounds(110, 30, 100, 30);
        label2.setBounds(0, 70, 100, 30);
        t2.setBounds(110, 70, 100, 30);
        b1.setBounds(0, 120, 100, 30);

        // Adding action listener to the button
        b1.addActionListener(this);
    }

    // This method handles button click events
    @Override
    public void actionPerformed(ActionEvent e) {
        // Error handling: Check if username or password fields are empty
        if (t1.getText().isEmpty() || t2.getText().isEmpty()) {
            // Display an error message if fields are empty
            JOptionPane.showMessageDialog(frame1, "Please enter both Username and Password", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // If fields are not empty, proceed to the next step
            frame1.dispose(); // Close the current frame

            try {
                // Attempt to create the next frame (Secon_JFrame)
                // FIX: Defined the Secon_JFrame class to prevent compilation errors
                Secon_JFrame plne2 = new Secon_JFrame(); 
            } catch (Exception ex) {
                // FIX: Error handling for exceptions during the creation of Secon_JFrame
                // This ensures the user is notified if something goes wrong
                JOptionPane.showMessageDialog(null, "An error occurred while opening the next frame.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    // Main method to start the application
    public static void main(String ag[]) {
        // Create an instance of LU7UI_Buttons to display the login form
        LU7UI_Buttons plne1 = new LU7UI_Buttons();
    }
}

// Definition of Secon_JFrame to avoid errors when attempting to open it
// FIX: Added the Secon_JFrame class definition to prevent compilation errors
class Secon_JFrame extends JFrame {
    Secon_JFrame() {
        // Set up the new frame
        setTitle("Second Frame");
        setSize(600, 300);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Example of adding a label to the second frame
        JLabel label = new JLabel("Welcome to the second frame!");
        label.setBounds(50, 50, 300, 30);
        add(label);
    }
}



