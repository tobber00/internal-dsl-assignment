package main;

import java.util.ArrayList;
import java.util.List;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;
import main.metamodel.Variable;

public class StateMachine {
	
	private List<State> states = new ArrayList<State>();
	private State initialState = null;
	private State currentState;
	private List<String> transNames = new ArrayList<String>();
	private List<String> transTargets = new ArrayList<String>();
	private List<Variable> transVarible = new ArrayList<Variable>(); 
	//maybe a variable with last method called?
	public Machine build() {
		if (initialState == null) {
			return new Machine(states);
		}
		return new Machine(states, initialState);
	}

	public StateMachine state(String string) {
		State state = new State(string);
		states.add(state);
		return this;
	}

	public StateMachine initial() {
		initialState = states.get(states.size() - 1);
		return this;
	}

	public StateMachine when(String string) {
		transNames.add(string);
		return this;
	}

	public StateMachine to(String string) {
		transTargets.add(string);
		return this;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
