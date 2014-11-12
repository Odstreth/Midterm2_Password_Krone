import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JButton;


public class Password implements ActionListener {

	private JFrame frmPasswordDemo;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Password window = new Password();
					window.frmPasswordDemo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Password() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordDemo = new JFrame();
		frmPasswordDemo.setTitle("Password Demo");
		frmPasswordDemo.setBounds(100, 100, 450, 300);
		frmPasswordDemo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordDemo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter the password:");
		lblNewLabel.setBounds(18, 112, 150, 14);
		frmPasswordDemo.getContentPane().add(lblNewLabel);
		
		password = new JPasswordField();
		password.setBounds(191, 109, 114, 20);
		frmPasswordDemo.getContentPane().add(password);
		password.addActionListener(this);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(335, 86, 89, 23);
		frmPasswordDemo.getContentPane().add(btnNewButton);
		btnNewButton.setActionCommand("OK");
		btnNewButton.addActionListener(this);
		
		
		JButton btnNewButton_1 = new JButton("HELP");
		btnNewButton_1.setBounds(335, 112, 89, 23);
		frmPasswordDemo.getContentPane().add(btnNewButton_1);
		btnNewButton_1.setActionCommand("HELP");
		btnNewButton_1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String action = arg0.getActionCommand();
		if (action.equals("OK")){
			char[] input = password.getPassword();
			if (String.valueOf(input).equals("bugaboo")){
				JOptionPane.showMessageDialog(frmPasswordDemo, "Success! You typed the right password.");
			}
			else{
				JOptionPane.showMessageDialog(frmPasswordDemo, "Invalid password. Try again.","Error Message",JOptionPane.ERROR_MESSAGE);
			}
		}
		if (action.equals("HELP")){
			JOptionPane.showMessageDialog(frmPasswordDemo, "Password is 'bugaboo' ");

		}
		
	}
}
