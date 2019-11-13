package _03_IntroToStacks;

import java.util.Random;

import java.util.Stack;

import javax.swing.JOptionPane;

public class _01_IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		// Don't forget to import the Stack class
		Stack<Double> s = new Stack<Double>();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 100; i++) {
			Random r = new Random();
			Double d = r.nextDouble() * 100;
			s.push(d);
		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String number = JOptionPane.showInputDialog("Enter in a number from 1-100:");
		Double num1 = Double.parseDouble(number);
		String number2 = JOptionPane.showInputDialog("Enter in another number from 1-100:");
		Double num2 = Double.parseDouble(number2);

		while (!s.empty()) {
			Double num = s.pop();
			if (num1 <= num2) {
				if (num < num2 && num > num1) {
					System.out.println(num);
				}
			} else if (num2 < num1) {
				if (num < num1 && num > num2) {
					System.out.println(num);
				}
			}
		}

		// 4. Pop all the elements off of the Stack. Every time a double is popped that
		// is
		// between the two numbers entered by the user, print it to the screen.

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
