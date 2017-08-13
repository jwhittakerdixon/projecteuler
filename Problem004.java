import java.io.*;

public class Problem004 {

	public static void main(String[] args) {

		int a=0;
		int b=0;
		int n=0;

		for (int i = 1; i<1000; i++) {

			for (int j = i; j<1000; j++) {

				if (isPalindrome(i*j)){
				if (i*j>n) {

					a=i;
					b=j;
					n=a*b;

				}
				}
			}

		}

		System.out.println(a + "*" + b + "=" + a*b);

	}

	public static Boolean isPalindrome(int x) {

		String n = new Integer(x).toString();
		String r = "";

		int length = n.length();
 
      		for ( int i = length - 1; i >= 0; i-- ) {
         		r = r + n.charAt(i);
 		}

		if (r.equals(n)){return true;}else{return false;}
	
	}

}
