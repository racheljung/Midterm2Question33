package question33;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Question33 extends JPanel implements ActionListener {
	
	private JPasswordField passwordField;
	private static JFrame controllingFrame;

	public Question33() {
		
		super(new BorderLayout());
		
		passwordField = new JPasswordField(15);
		passwordField.setActionCommand("ok");
		passwordField.addActionListener(this);
		
		JLabel label = new JLabel("Password:");
		label.setLabelFor(passwordField);
		JButton btn1= new JButton("OK");
		JButton btn2 = new JButton("Help");
		btn1.setActionCommand("ok");
		btn2.setActionCommand("Help");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		JPanel buttonPane = new JPanel(new GridLayout(0, 1));
		buttonPane.add(btn1);
		buttonPane.add(btn2);
		JPanel fieldPane = new JPanel(new GridLayout(0, 1));
		fieldPane.add(label);
		fieldPane.add(passwordField);
		setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		add(fieldPane, BorderLayout.CENTER);
		add(buttonPane, BorderLayout.LINE_END);
	}

	public void actionPerformed(ActionEvent a) {
		String ap = a.getActionCommand();
		if ("ok".equals(ap)) { 
			char[] input = passwordField.getPassword();
			if (isPasswordCorrect(input)) {
				JOptionPane.showMessageDialog(controllingFrame,
						"Correct.");
			} else {
				JOptionPane.showMessageDialog(controllingFrame,
						"Please try again.");
			}

			passwordField.selectAll();
		} else { 
			JOptionPane
			.showMessageDialog(
					controllingFrame,
					"Please enter the proper password.");
		}
	}

	private static boolean isPasswordCorrect(char[] input) {
		boolean isCorrect = true;
		char[] Password = { 'b', 'u', 'g', 'a', 'b', 'o', 'o' };
		if (input.length != Password.length) {
			isCorrect = false;
		} else {
			for (int i = 0; i < input.length; i++) {
				if (input[i] != Password[i]) {
					isCorrect = false;
				}
			}
		}
		
		for (int i = 0; i < Password.length; i++) {
			Password[i] = 0;
		}
		return isCorrect;
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("");
		controllingFrame = frame;
		frame.add(new Question33());
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event dispatch thread:
		// creating and showing this application's GUI.
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// Turn off metal's use of bold fonts
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				createAndShowGUI();
			}
		});
	}
}