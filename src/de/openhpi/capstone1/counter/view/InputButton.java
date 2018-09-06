package de.openhpi.capstone1.counter.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import de.openhpi.capstone1.counter.controller.CounterController;

public class InputButton extends JButton implements ActionListener {
	
	CounterController controller;

	public InputButton(CounterController controller, String label) {
		super(label);
		this.controller = controller;

		addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
//		System.out.println(e.getActionCommand());
		controller.handleEvent();
	}

}
