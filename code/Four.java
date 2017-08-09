import java.io.*;

public class Four {

	public static void main(String[] args) {

		int a = 999;
		int b = 999;


		while (true) {

			if (isPalindrome(a*b)){break;}
			a=a-1;

		}

		System.out.println(a*b);

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
