package de.openhpi.capstone1.counter.view;

import java.awt.Color;

import javax.swing.JPanel;

import de.openhpi.capstone1.counter.model.Subject;

public class CounterViewColor extends Observer {

	JPanel p = new JPanel(); 
	Color[] colors = new Color[4];
	
	public CounterViewColor(Subject counter) {
		super(counter);
		init();
	}

	public void init(){
		colors[0] = Color.black;
		colors[1] = Color.blue;
		colors[2] = Color.orange;
		colors[3] = Color.red;
		
		update(0);
	}
	
	@Override
	public void update(Object value) {
		try {
			int index = ((int) value) % 4;
			p.setBackground(colors[index]);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public JPanel getPanel() {
		return this.p;
	}
}