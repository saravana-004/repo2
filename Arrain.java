package exce;

public class Arrain {
	//Error stackoverflow
	public void findA() {
	findB();
	}
	private void findB() {
	findA();

	}

	public static void main(String[] args) {
	Arrain of = new Arrain();
	of.findB();
	

	}
	

}
