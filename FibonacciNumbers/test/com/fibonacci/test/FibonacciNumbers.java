package com.fibonacci.test;

public class FibonacciNumbers {

	public int generate(int position) {
		if (position < 2)
			return position;
		return generate(position - 1) + generate(position - 2);
	}

}
