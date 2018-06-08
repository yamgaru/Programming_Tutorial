
public class usingvoidinmainfunction {
	public static int mainfunction(int a,int b) {
		int c;
		c=a+b;
	}
public static void main(String[] args) {
	int i=10;
	int j=20;
//	int k;
//	k=i;
//	i=j;
//	j=k;
	int k=mainfunction(i,j);
	System.out.println(k);
}
}
