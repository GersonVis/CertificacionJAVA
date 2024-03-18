package main;

import java.sql.SQLException;
import java.lang.StackOverflowError;


public class Main {

	public static void main(String[] args) {
		
	}
	
	public void doSomething() {
		//throw new NullPointerException();
		//throw new StackOverflowError();
		try {
			throw new Exception();
			//throw new SQLException();
		}catch(SQLException e) {
			
		}
		
	}
}


class Vehicle {
	protected int speed;
	public void accelerate() {
		speed+=10;
	}
}
class Car extends Vehicle{
	public void accelerate() {
		super.accelerate();
		speed+=20;
	}
}



abstract class Animal
{
     private int edad;
	 void eat() {
		 System.out.println("Animal");
	 }
	 abstract void comer();
}



class Dog extends Animal{
     	
	public void eat() {
		super.eat();
		System.out.println("Dog");
		
		super.edad;
	}
	
	
}