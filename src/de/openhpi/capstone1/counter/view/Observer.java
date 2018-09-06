package de.openhpi.capstone1.counter.view;

import de.openhpi.capstone1.counter.model.Subject;

public abstract class Observer {
	protected Subject counter;
	
	public Observer(Subject counter) {
		super();
		this.counter = counter;
		this.counter.attach(this);
	}
	
	public abstract void update(Object value);
}


