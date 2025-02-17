package org.dev;

public class Sample {

	private void add() {
		System.out.println("add");
	}

	private void sub() {
		System.out.println("sub");
	}

	public static void main(String[] args) {

		Sample s = new Sample();
		s.add();
		s.sub();

	}

}
