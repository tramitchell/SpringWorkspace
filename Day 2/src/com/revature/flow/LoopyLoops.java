package com.revature.flow;

public class LoopyLoops {
	/*
	 * If Statement
	 * for decision making
	 * provides multiple paths of execution
	 * 
	 * if(<first conditional>) {
	 *    <what logic to do if true>
	 * }
	 * else if (<second conditional>) {
	 *    <what logic to do if first conditional is false and second conditional is true>
	 * } 
	 * else {
	 *    <what logic to do if both conditionals false>
	 * }
	 * 
	 * Switch Cases
	 * provides multiple paths of execution based on some value
	 * the "switch" is based on an integer numeric, String, char, boolean, or enum()
	 *
	 * For Loops
	 * for(a;b;c) {do something}
	 * a declares index variabl (counter)
	 * b is the conditional that controls how far the loop will go
	 * c is the incrementor/decrementor
	 * 
	 * while
	 * 
	 * do while
	 */
	
	public static void ifMethod(int a) {
		if (a > 50) {
			System.out.println("a is bigger than 50");
		}
		else if(a == 50) {
			System.out.println("a is smack dab on 50!");
		}		
		else {
			System.out.println("a is smaller than 50");
		}
	}
	
	public static void switchMethod(String color) {
		switch(color) {
		case "green":
			System.out.println("Green is the best");
			break;
		case "red":
			System.out.println("you picked red");
			break;
		case "yellow":
			System.out.println("caution yellow");
			break;
		default:
			System.out.println("you're dumb. pick a better color");
			break;
		}
	}

	public static void forLoopFunness(int p) {
		for(int i = p; i < 27; i++) {
			if(i == 13)
				//break; breaks out of loop
				continue; //skips the current iteration
			System.out.println(i);
		}
	}
	
	public static void wileyWhile(int i) {
		while (i<7) {
			System.out.println("Boring");
			i++;
		}
	}
	
	public static void doWileyWhile(int i) {
		do {
			System.out.println(i);
			i++;
		}
		while(i<7);
	}
	public static void main(String[] args) {
//		ifMethod(75);
//		ifMethod(3);
//		ifMethod(50);
//		switchMethod("yellow");
//		forLoopFunness(3);
//		wileyWhile(4);
		doWileyWhile(4);
		
		
	}
}
