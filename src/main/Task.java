package main;

import java.awt.Panel;

import javax.swing.*;

public class Task {
	String name;
	public Task(String name) {
		name = this.name;
	}
	
	public void addTask(JFrame frame) {
		JPanel panel = new JPanel();
		JButton delete = new JButton("X");
		JButton mark = new JButton("V");
		JLabel task = new JLabel(this.name);
		panel.add(task);
		panel.add(delete);
		panel.add(mark);
		frame.add(delete);
		frame.getContentPane().add(panel);
		frame.repaint();
	}	
	
}
