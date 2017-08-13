import java.io.*;

public class Problem007 {

	public static void main(String[] args) {

		int i = 1;
		int n = 0;

		while (true) {

			if (isPrime(i)) {n++;}

			if (n==10001) {break;}

			i++;

		}

		System.out.println(i);

	}

	public static Boolean isPrime(int i) {

		if (i==1){return false;}
		if (i==2){return true;}

		int j = 2;

		while (j<Math.sqrt(i)) {

			if (i % j == 0) {return false;}
			j++;

		}

		return true;
	
	}

}
