package view;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import javax.swing.JCheckBox;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.Color;

public class Sum_Fun extends JFrame {

	private JPanel gameBoardPane;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Sum_Fun frame = new Sum_Fun();
					frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	public Sum_Fun() 
	{
		intitializeBoard();

	}

	public void intitializeBoard() 
	{
		setResizable(false);
		setBackground(new Color(240, 240, 240));
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sum_Fun.class.getResource("/resources/sum.ico")));
		setTitle("Sum Fun");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		gameBoardPane = new JPanel();
		gameBoardPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(gameBoardPane);
		gameBoardPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}
	
}