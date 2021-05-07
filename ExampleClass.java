import java.util.Scanner;

public class ExampleClass {
	
	    public static void main(String[] args) {
			int n = 5;
			float total = 0f;
			for(int i=1;i<=n;i++) {
				Scanner sc = new Scanner(System.in);
		    	System.out.println("enter the mark in subject: "+i);
		    	int mark = sc.nextInt();
				total = mark+total;
			}
			System.out.println(total/n+"%");
		}

}