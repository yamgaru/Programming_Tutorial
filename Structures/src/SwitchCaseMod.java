import java.util.Scanner;


public class SwitchCaseMod {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		if(0<b && b<10) {
//		switch (a%b) {
//		case(1):
//			System.out.println("One");
//		break;
//		case(2):
//			System.out.println("two");
//		break;
//		case(3):
//			System.out.println("three");
//		break;
//		case(4):
//			System.out.println("four");
//		break;
//		case(5):
//			System.out.println("five");
//		break;
//		case(6):
//			System.out.println("six");
//		break;
//		case(7):
//			System.out.println("seven");
//		break;
//		case(8):
//			System.out.println("eight");
//		break;
//		case(9):
//			System.out.println("nine");
//		break;
//		case(10):
//			System.out.println("ten");
//		break;
//		default:
//			System.out.println("you can print this result because the result is greater than 10 and less than 1");
//		}
//	}else {
//		System.out.println("your have entered a wrong value for b");
//	}
		
		
		
		
		
		/*
		 * Todo: First check if 0<b<10.If this condition does not hold, print a little
		 * output informing the user that he or she enteres wrong values.
		 * If this conditions holds, perform a modulo operation for a%b.
		 * Print the result as a String (e.g. "five"). You can achieve that by using a switch case
		 * */

//	}
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the numbers a and b");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(b>0&&b<11) {
			switch(b%a) {
			case(0):
			    System.out.println("zero");
			case(1):
			    System.out.println("one");
			break;
			
			case(2):
				System.out.println("two");
			break;
			case(3):
				System.out.println("three");
			break;
			case(4):
				System.out.println("four");
			break;
			case(5):
				System.out.println("five");
			break;
			case(6):
				System.out.println("six");
			break;
				
			case(7):
				System.out.println("seven");
			break;
			case(8):
				System.out.println("eight");
			break;
			case(9):
				System.out.println("nine");
			break;
//			case(10):
//				System.out.println("ten");
//			break;
			
		}
			
		}else {
			System.out.println("you have entered the wrong number");
		}
	
	}
}
