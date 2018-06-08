
public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.
	public static int circlediameter (int r1) {
		int diameter=2*r1;
		return diameter;
	}
		public static double circlecircumference (int r2) {
		double circumference=2*(Math.PI)*r2;
		return circumference;
		}
		public static double circlearea (int r3) {
		double area=(Math.PI)*(Math.pow(r3,2));
	    return area ;
	}
		public static void main(String[] args) {
			int r = 1;
			int d = circlediameter(r);
			System.out.println("diameter of circle is"+" "+d);
			double c = circlecircumference(r);
			System.out.println("circumference of circle is"+" "+c);
			double a = circlearea(r);
			System.out.println("area of circle is"+" "+a);
		}
	
}
