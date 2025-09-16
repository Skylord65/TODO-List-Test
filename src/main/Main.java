package main;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		//Création fenêtre principale
		JFrame frame = new JFrame("TODO-List");
		
		// taille fenetre
		frame.setSize(400,300);
		
		// paramètre fenetre
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(frame);
		
		
		// Création bouton pour ajouter une liste
		JButton bouton = new JButton("Ajouter une tache");
		
		//Ajouter à la fentetre
		frame.add(bouton);
		
		//label
		JLabel label = new JLabel("",JLabel.CENTER);
		
		bouton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO ajouter un label avec la nouvelle tache
				Task task = new Task("New task");
				task.addTask(frame);
				
			
			}
		} );
		// panel
		JPanel panel = new JPanel();
	
		panel.add(bouton);
		panel.add(label);
		
		//Ajouter à la fenetre
		frame.getContentPane().add(panel);
		
		
		
		// Afficher fenetre
		frame.setVisible(true);
	}
}
