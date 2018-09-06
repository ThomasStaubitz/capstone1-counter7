package de.openhpi.capstone1.counter.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import de.openhpi.capstone1.counter.controller.CounterController;
import de.openhpi.capstone1.counter.model.Subject;

public class Layout extends JPanel {
	
	CounterController controller;
	Subject counter;
	
	public Layout (CounterController controller, Subject counter) {
		this.controller = controller;
		this.counter = counter;
	}

	public Dimension preferredSize() {
		return new Dimension(200, 100);
	}

	public void init() {
		setLayout(new BorderLayout());
		JPanel p;
		p = new JPanel();
		p.setLayout(new GridLayout(0, 2));
		p.add(new JLabel("Button"));
		JButton inputButton = new InputButton(controller, "Press Me");
		p.add(inputButton);
		p.add(new JLabel("Counter"));
		CounterViewNumber counterViewNumber = new CounterViewNumber(counter);
		p.add(counterViewNumber.getPanel());    
		CounterViewColor counterViewColor = new CounterViewColor(counter);
		p.add(counterViewColor.getPanel());
		add(p);
	}
}
