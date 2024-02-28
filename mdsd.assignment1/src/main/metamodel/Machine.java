package main.metamodel;

import java.util.List;
import java.util.ArrayList;

public class Machine {
	private List<State> states;
	private State initialState; 
	private List<Variable> integers = new ArrayList<Variable>(); 
	
	public Machine(List<State> states) {
		this.states = states;
		initialState = states.get(0);
	}
	
	public Machine(List<State> states, State initialState) {
		this.states = states;
		this.initialState = initialState;
	}
	
	public void addInterger(Variable variable) {
		integers.add(variable);
	}
	
	//below is given methods
	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		for (State state : states) {
			if (state.getName().equals(string)) {
				return state;
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		return integers.size();
	}

	public boolean hasInteger(String string) {
		if (integers.size() > 0) {
			return true;
		}
		return false;
	}
}

