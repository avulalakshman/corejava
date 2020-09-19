package com.careerit.cj.day14;

import java.util.Random;

interface MusicInstrument {
	public abstract void sound();
}

class Flute implements MusicInstrument {

	public void sound() {
		System.out.println(this.getClass().getSimpleName() +" PE PE PPEEEE PEEEE PEEE PEEEE ");
	}
}

class Guitar implements MusicInstrument {

	@Override
	public void sound() {
		System.out.println(this.getClass().getSimpleName()+ " TIN TINTINT TINT TIN TIN TIN TIN");
	}

}

class Piano implements MusicInstrument {

	@Override
	public void sound() {
		System.out.println(this.getClass().getSimpleName()+" PEEEEEEE PEEEEEEEEEEEEEEEE  PEEEEEEEEEEEEEEEEEEEE");

	}

}

public class InstrumentManager {

	public static void main(String[] args) {
		// 10 instrument objects
		// Create random number 1. Flute 2. Guitar 3. Piano
		// Play all the music instruments
		MusicInstrument[] arr = new MusicInstrument[10];
		for (int i = 0; i < arr.length; i++) {
			// Generate 1 - 3
			Random random = new Random();
			int num = random.nextInt(3)+1;
			
			if(num == 1) {
				arr[i]=new Flute();
			}else if(num == 2) {
				arr[i] = new Guitar();
			}else if(num == 3) {
				arr[i] = new Piano();
			}
			
		}
		
		for(int i=0;i<arr.length;i++) {
				MusicInstrument obj = arr[i];
				obj.sound();
		}

	}
}
