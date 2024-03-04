package main;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.eat();
	}
	
	
}


abstract class Animal
{
	 void eat() {
		 System.out.println("Animal");
	 }
}

class Dog extends Animal{
     	
	public void eat() {
		super.eat();
		System.out.println("Dog");
	}
	
	
}