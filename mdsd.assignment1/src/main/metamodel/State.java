package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name;
	private List<Transition> transitions;
	
	public State(String name) {
		this.name = name;
		transitions = new ArrayList<Transition>();
	}
	
	public void addTransition(Transition transition) {
		transitions.add(transition);
	}
	
	//below is given methods
	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public Transition getTransitionByEvent(String string) {
		for (Transition transition : transitions) {
			if (transition.getEvent().equals(string)) {
				return transition;
			}
		}
		return null;
	}
}
