package main.metamodel;

public class Variable {
	private String name;
	private int value;
	
	public Variable(String name) {
		this.name = name;
		value = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void incriment() {
		value++;
	}
	
	public void decriment() {
		value--;
	}
	
}
