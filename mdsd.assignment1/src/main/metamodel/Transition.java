package main.metamodel;


public class Transition{
	
	enum Operation {
		SET,
		INC,
		DEC
	}
	
	private String event;
	private State target;
	private Operation operation;
	private Variable variable;
	private boolean conditional;
	private int comparedValue;
	
	public Transition(String event, State target, Variable variable) {
		this.event = event;
		this.target = target;
		this.variable = variable;
		conditional = false;
	}
	
	public Transition(String event, State target, Variable variable, int comparedValue) {
		this.event = event;
		this.target = target;
		this.variable = variable;
		conditional = true;
		this.comparedValue = comparedValue;
	}
	
	public void setOperation(String operation) {
		switch(operation) {
			case "SET": 
				this.operation = Operation.SET;
				return;
			case "INC":
				this.operation = Operation.INC;
				return;
			case "DEC":
				this.operation = Operation.DEC;
				return;
		}
	}
	
	//below is given methods
	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}

	public boolean hasSetOperation() {
		if (operation == Operation.SET) {
			return true;
		}
		return false;
	}

	public boolean hasIncrementOperation() {
		if (operation == Operation.INC) {
			return true;
		}
		return false;
	}

	public boolean hasDecrementOperation() {
		if (operation == Operation.DEC) {
			return true;
		}
		return false;
	}

	public Object getOperationVariableName() {
		return variable.getName();
	}

	public boolean isConditional() {
		return conditional;
	}

	public Object getConditionVariableName() {
		return variable.getName();
	}

	public Integer getConditionComparedValue() {
		return comparedValue;
	}

	public boolean isConditionEqual() {
		if (variable.getValue() == comparedValue) {
			return true;
		}
		return false;
	}

	public boolean isConditionGreaterThan() {
		if (variable.getValue() < comparedValue) {
			return true;
		}
		return false;
	}

	public boolean isConditionLessThan() {
		if (variable.getValue() > comparedValue) {
			return true;
		}
		return false;
	}

	public boolean hasOperation() {
		if (operation == null) {
			return false;
		}
		return true;
	}

}
