package com.dev.Abstraction;

public interface Abs2 {
	
	void display1();
	
	public int i=2;
	
   default void print1() {
		System.out.println("Hello");
	}
   
  

}
