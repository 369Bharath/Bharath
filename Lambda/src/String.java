import java.util.Scanner;
public class String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x, y;
		x=sc.nextInt();
		y=sc.nextInt();
		if(x==y) {
			System.out.println("value of both variables is equal");
			
		}
		else {
			System.out.println("value is different");
		}
		System.out.println("======working with strings====");
		System .out.println("Enter two strins");
		String str1=sc.next();
		String str2=sc.next();
		if(str1.equals(str2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
