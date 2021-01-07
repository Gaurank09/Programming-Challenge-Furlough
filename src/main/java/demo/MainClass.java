package demo;

import java.time.LocalDate;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		TASK1();
		TASK2();
		TASK3();
		TASK4();
		TASK5();
		TASK6();
		TASK7();
		TASK8();

	}

	private static void TASK8() {
		// TODO write a program that concatenates two list
		delimmitter();
		System.out.println("Task8: A program that concatenates two list by taking alternate elements");
		System.out.println("Enter the size of list 1: ");
		int number = new Scanner(System.in).nextInt();
		char list[] = new char[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the " + (i + 1) + "st/th element of 1st list: ");
			list[i] = new Scanner(System.in).next().charAt(0);
		}
		System.out.println("Enter the size of list 2: ");
		int number2 = new Scanner(System.in).nextInt();
		char list2[] = new char[number2];
		for (int i = 0; i < number2; i++) {
			System.out.println("Enter the " + (i + 1) + "st/th element of 1st list: ");
			list2[i] = new Scanner(System.in).next().charAt(0);
		}
		char result[] = new char[number2 + number];
		int l1 = 0;
		int l2 = 0;
		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0) {
				result[i] = list[l1];
				l1++;
			} else {
				result[i] = list2[l2];
				l2++;
			}

		}

		System.out.println("result is: ");
		System.out.print("[");
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + ",");
		System.out.print("]");
		delimmitter();
	}

	private static void TASK7() {
		// TODO write a program that concatenates two list
		delimmitter();
		System.out.println("Task7: A program that concatenates two list");
		System.out.println("Enter the size of list 1: ");
		int number = new Scanner(System.in).nextInt();
		char list[] = new char[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the " + (i + 1) + "st/th element of 1st list: ");
			list[i] = new Scanner(System.in).next().charAt(0);
		}
		System.out.println("Enter the size of list 2: ");
		int number2 = new Scanner(System.in).nextInt();
		char list2[] = new char[number2];
		for (int i = 0; i < number2; i++) {
			System.out.println("Enter the " + (i + 1) + "st/th element of 1st list: ");
			list2[i] = new Scanner(System.in).next().charAt(0);
		}
		char result[] = new char[number2 + number];
		for (int i = 0; i < number; i++)
			result[i] = list[i];
		for (int i = 0; i < number2; i++)
			result[i + number] = list2[i];
		System.out.println("result is: ");
		System.out.print("[");
		for (int i = 0; i < result.length; i++)
			System.out.print(result[i] + ",");
		System.out.print("]");
		delimmitter();
	}

	private static void TASK6() {
		// TODO write a program that checks whether the given string is palindrome or
		// not
		delimmitter();
		System.out.println("Task6: A program that checks whether the given string is palindrome or not");
		System.out.println("Enter the input string: ");
		String input = new Scanner(System.in).nextLine();
		char[] rev = new char[input.length()];
		int x = 0;
		for (int i = input.length() - 1; i >= 0; i--) {
			rev[x] = input.charAt(i);
			x++;
		}
		boolean result = true;
		for (int i = 0; i < input.length(); i++) {
			if (rev[i] != input.charAt(i)) {
				System.out.println("Not palindrome");
				result = false;
				break;
			}
		}
		if (result)
			System.out.println("Palindrome");

		delimmitter();
	}

	private static void TASK5() {
		// TODO write a program that prints largest element from a list
		delimmitter();
		System.out.println("Task5: A program that prints largest element from a list");
		System.out.println("Enter the size of list: ");
		int number = new Scanner(System.in).nextInt();
		int list[] = new int[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter the " + (i + 1) + "st/th element of list: ");
			list[i] = new Scanner(System.in).nextInt();
		}
		int max = list[0];
		for (int i = 0; i < number; i++) {
			if (list[i] > max)
				max = list[i];
		}
		System.out.println("Result is: " + max);
		delimmitter();
	}

	private static void TASK1() {
		// TODO write a program that asks for a number n and prints the sum of number
		// from 1 to n
		delimmitter();
		System.out.println("Task1: A program that asks for a number n and prints the sum of number from 1 to n");
		System.out.println("Enter a number: ");
		int number = new Scanner(System.in).nextInt();
		System.out.println("Result is: " + number * (number + 1) / 2);
		delimmitter();
	}

	private static void TASK2() {
		// TODO write a program that prints 12 multiplication table
		delimmitter();
		System.out.println("Task2: A program that prints 12 multiplication table");
		for (int i = 1; i <= 10; i++) {
			System.out.println("12 x " + i + " = " + 12 * i);
		}
		delimmitter();
	}

	private static void TASK3() {
		// TODO Guessing game
		delimmitter();
		System.out.println("Task3: Guessing Game");
		int secretNumber = Double.valueOf(Math.random() * 10).intValue();
		int guessNo = 0;
		int previousNumber = -1;
		while (true) {
			System.out.println("Enter a guess: ");
			int number = new Scanner(System.in).nextInt();
			if (previousNumber != number)
				guessNo++;
			if (number < secretNumber) {
				System.out.println("Too Low");
			} else if (number > secretNumber) {
				System.out.println("Too high");
			} else {
				System.out.println("Correct");
				break;
			}
			previousNumber = number;
		}
		System.out.println("Total guesses made: " + guessNo);
		delimmitter();
	}

	private static void TASK4() {
		// TODO write a program that prints next 20 leap years
		delimmitter();
		System.out.println("Task4: A program that prints next 20 leap years");
		int count = 0;
		LocalDate thisdate = LocalDate.now();
		while (count < 20) {
			if (thisdate.isLeapYear()) {
				count++;
				System.out.println("Leap year: " + thisdate.getYear());
			}
			thisdate = thisdate.plusYears(1);
		}
		delimmitter();
	}

	private static void delimmitter() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------");
	}

}
