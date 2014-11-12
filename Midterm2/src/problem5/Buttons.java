package problem5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

import java.awt.GridLayout;

import javax.swing.BoxLayout;

import net.miginfocom.swing.MigLayout;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JRadioButtonMenuItem;

public class Buttons extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buttons frame = new Buttons();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Buttons() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnSmall = new JRadioButton("Small", true);
		rdbtnSmall.setBounds(26, 44, 109, 23);
		contentPane.add(rdbtnSmall);
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium", false);
		rdbtnMedium.setBounds(26, 68, 109, 23);
		contentPane.add(rdbtnMedium);
		
		JRadioButton rdbtnLarge = new JRadioButton("Large", false);
		rdbtnLarge.setBounds(26, 94, 109, 23);
		contentPane.add(rdbtnLarge);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnSmall);
		buttonGroup.add(rdbtnMedium);
		buttonGroup.add(rdbtnLarge);
		

	}
}
