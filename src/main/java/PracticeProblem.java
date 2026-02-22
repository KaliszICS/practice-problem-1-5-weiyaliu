/**
	* File: Lesson 1.5: Characters
	* Author: Mr. Kalisz
	* Date Created: February 22, 2026
	* Date Last Modified: February 22, 2026
	*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
	}

	public static void q1() {
		//Write question 1 code here
		char a;
		a = 'a';
		System.out.println(a);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		
		System.out.print ("Input a word: ");
		String word = input.nextLine();
		
		char letter = word.charAt(2);

		System.out.println(letter);
		input.close();

	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a word: ");
		String word = input.nextLine();
		char letter = word.charAt(1);

		System.out.print("The second character user entered was: ");
		System.out.println(letter);

		input.close();

	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a number: ");
		int num = input.nextInt();

		System.out.println("Your number plus 1 is: " + (num + 1)); 

		input.close();
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);

		System.out.print("Input a letter: ");
		String letter1 = input.nextLine();
		char char1 = letter1.charAt(0);

		System.out.print("Input another letter: ");
		String letter2 = input.nextLine();
		char char2 = letter2.charAt(0);

		int sum = char1 + char2;
		System.out.println(sum);

		input.close();
	}

}
