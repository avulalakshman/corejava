package com.careerit.cj.day15;

import java.util.Arrays;

interface Game {
	void start();

	void play();

	void stop();
}

abstract class AbstractNumberOperations {

	public int[] generatePrime(int lb, int ub) {
		int count = numberOfPrimes(lb, ub);
		int[] arr = new int[count];
		// Logic
		return arr;
	}

	public abstract int numberOfPrimes(int lb, int ub);

}

 class ENumberOperations extends AbstractNumberOperations{

	 
	@Override
	public int numberOfPrimes(int lb, int ub) {
		return 0;
	}
	
}


abstract class EmiCalc {

	public double calculateEmi(double amount, double rate, double duration) {
		// Logic
		return 0;
	}
}

class LoanDetails extends EmiCalc {

	void showDetails() {
		double amount = calculateEmi(100000, 12, 12);
	}
}

abstract class AbstractGame implements Game {

	public void start() {
		System.out.println(this.getClass().getSimpleName() + " game started ");

	}

	public void stop() {
		System.out.println(this.getClass().getSimpleName() + " game stoped ");
	}
}

class ToyGame extends AbstractGame implements Game {

	@Override
	public void play() {
		System.out.println("You are playing.... Toy game...");

	}

}

class Bike extends AbstractGame implements Game {

	public void play() {
		System.out.println("You are playing Bike game please wear helmet");
	}

}

class Car extends AbstractGame implements Game {

	@Override
	public void play() {
		System.out.println("You are playing Car game please wear seat belt");
	}

}

abstract class A{
	A(){
		System.out.println("One");
	}
}

class B extends A{
	B(){
	
		System.out.println("Two");
	}
}
public interface GameRunner {

	public static void main(String[] args) {

				AbstractNumberOperations obj = new ENumberOperations();
				int[] arr = obj.generatePrime(10, 100);
				System.out.println(Arrays.toString(arr));
				
				
				A one= new B();
				
	}
}
