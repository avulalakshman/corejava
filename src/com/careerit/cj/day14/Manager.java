package com.careerit.cj.day14;

interface Game {
	void start();
	void play();
	void stop();
}

class Bike implements Game{
	
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" game started ");
	}
	public void play() {
		System.out.println("You are playing Bike game please wear helmet");
	}
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" game stoped ");
	}
}

class Car implements Game{
	@Override
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" game started ");
	}

	@Override
	public void play() {
		System.out.println("You are playing Car game please wear seat belt");
	}

	@Override
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" game stoped ");
	}
	
}



public class Manager {
	public static void main(String[] args) {
		Game game = new Car();//new Bike();
		game.start();
		game.play();
		game.stop();
	}
}
