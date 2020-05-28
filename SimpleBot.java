import java.util.Scanner;

public class SimpleBot {
	final static Scanner scanner = new Scanner(System.in);
	
	// main
	public static void main(String[] args) {
		greet("Caprica","2020");
		remindName();
		guessAge();
		count();
		test();
		end();
	}
	
	// functions
	static void greet(String assistantName, String birthYear) {
		System.out.println("Hello! My name is " + assistantName + ".");
		System.out.println("I was created in " + birthYear);
	}
	
	static void remindName() {
		System.out.println("Please remind me your name.");
		String name = scanner.nextLine();
		System.out.println("What a great name you have, " + name + "!");
	}
	
	static void guessAge() {
		System.out.println("Let me guess your age.");
		System.out.println("Type in the remainders of dividing your age by 3, 5, and 7.");
		int rem3 = scanner.nextInt();
		int rem5 = scanner.nextInt();
		int rem7 = scanner.nextInt();
		int age = (rem3 * 70 + rem5 * 21 + rem7 + 15) % 105;
		System.out.println("Your age is " + age + "; that's a goot time to start programming!");
	}
	
	static void count() {
		System.out.println("Now I will count up to any number you specify, please enter an integer: ");
		int num = scanner.nextInt();
		for (int i = 0; i <= num; i++) {
			System.out.printf("%d!\n", i);
		}
	}
	
	static void test() {
		System.out.println("Let's test your knowledge.");
		int uInput;
		while (true) {
			System.out.println("Does all of this have to happen again?");
            System.out.println("1. Yes");
            System.out.println("2. Probably yes");
            System.out.println("3. Maybe not");
            System.out.println("4. No");
            // The answer is 3.
            if ((uInput = scanner.nextInt()) == 3) {
                break;
            } else {
                System.out.println("Please try again.");
            }
		}
	}
	
	static void end() {
		System.out.println("Congratulations, have a nice day!");
	}
}