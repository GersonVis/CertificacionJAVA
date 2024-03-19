package main;

import java.sql.SQLException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.StackOverflowError;


public class Main {

	public static void main(String[] args) {
			int[] numeros = new int[3];
			numeros[4] = 10;		
	}
	
	public static void doSomething() throws Exception{
		//throw new NullPointerException();
		//throw new StackOverflowError();
		
		//	throw new Exception();
		throw new SQLException();
		
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