package com.dev.Abstraction;

public abstract class AbstactExample {
	private int i;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	abstract void display();
//abstract void print(); error since no implemented in child and child is not abstract
	
	/* Can have constructor */
	public AbstactExample() { 
		System.out.println("Constructor of abstract class");
	}
	
	public void show() {
		System.out.println("Concrete method of abstract class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}

	

}
