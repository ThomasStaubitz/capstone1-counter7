package de.openhpi.capstone1.counter.view;

import javax.swing.JPanel;
import javax.swing.JTextField;

import de.openhpi.capstone1.counter.model.Subject;

public class CounterViewNumber extends Observer {

	JPanel p = new JPanel(); 
	JTextField tf = new JTextField();
	
	public CounterViewNumber(Subject counter) {
		super(counter);
		init();
	}

	public void init(){
		update("0");
		p.add(tf);
	}

	public void update(Object value) {
		System.out.println("update: " + value);
		tf.setText(value + "");
	}
	
	public JPanel getPanel() {
		return this.p;
	}

}