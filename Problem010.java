import java.io.*;

public class Problem010 {

	public static void main(String[] args) {

		int n = 1;
		int sum = 0;

		while (n <= 2000000) {

			if (isPrime(n)){sum=sum+n;}
			n++;
		
		}

		System.out.println(sum);

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
