package de.openhpi.capstone1.counter.starter;
import javax.swing.JFrame;

import de.openhpi.capstone1.counter.controller.CounterController;
import de.openhpi.capstone1.counter.model.Counter;
import de.openhpi.capstone1.counter.view.Layout;


public class TheApp {

	public void init() {
		Counter counter = new Counter();
		CounterController counterController = new CounterController(counter);
		
		JFrame f = new JFrame("Counter");
		Layout layout = new Layout(counterController, counter);

		layout.init();
		f.add("Center", layout);
		
		f.pack();
		f.setVisible(true);
	}
}
