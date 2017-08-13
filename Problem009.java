import java.io.*;

public class Problem009 {

	public static void main(String[] args) {

		int[] sol = run();

		System.out.println(sol[0] + "^2 +" + sol[1] + "^2 =" + sol[2] + "^2");
		System.out.println(sol[0] + "+" + sol[1] + "+" + sol[2] + "=1000");
		System.out.println(sol[0] + "*" + sol[1] + "*" + sol[2] + "=" + sol[0]*sol[1]*sol[2]);

	}

	public static int[] run() {

		int c = 0;
		int[] sol = {0,0,0};
		
		for (int a = 1; a<1000; a++){

			for (int b = 1; b<1000; b++) {

				c=1000-a-b;
				if (isTriplet(a,b,c)){
					sol[0]=a;
					sol[1]=b;
					sol[2]=c;
					return sol;
				}
				

			}

		}
		return sol;

	}

	public static Boolean isTriplet(int a, int b, int c) {

		int left = a*a+b*b;
		int right = c*c;

		return left==right;

	}

}
