package Algoritmics.practica2;

import Algoritmics.practica2.utils.Operation;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		String op = "6*7 +2";
		Operation.separate(op);
		System.out.println(Operation.order());
	}

}