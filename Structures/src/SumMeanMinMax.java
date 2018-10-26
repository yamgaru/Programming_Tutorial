import java.util.Scanner;


public class SumMeanMinMax {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int sum=a+b+c;
//		float mean=sum/3;
//		if (a>b&&a>c) {
//			System.out.println(a + " " + "maximum");
//		}else if (b>a&&b>c) {
//			System.out.println(b + " " + "maximum");
//		}else {
//			System.out.println(c + " " + "maximum");
//		}
//		if (a<b&&a<c) {
//			System.out.println(a + " " + "minimum");
//		}else if (b<a&&b<c) {
//			System.out.println(b + " " + "minimum");
//		}else {
//			System.out.println(c + " " + "minimum");
//		}
//		
//		
//		System.out.println(sum + "," +mean);
//		
//		
//
//		
//
//	}

	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the three numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		System.out.println("the sum of the a ,b and c is"+ (a+b+c));
		
		if(a<b&&a<c) {
			System.out.println("a is minimum value");
		}else if(b<a&&b<c) {
			System.out.println("b is minimum value");
		}else {
			System.out.println("c is minimum value");
		}
		if(a>b&&a>c) {
			System.out.println("a is maximum value");
		}else if(b>a&&b>c) {
			System.out.println("b is maximum value");
		}else {
			System.out.println("c is maximum value");
		}
	}
	
	
	
	
	
	
	
}
