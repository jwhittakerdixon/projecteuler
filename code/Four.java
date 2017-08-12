import java.io.*;

public class Three {

	public static void main(String[] args) {

		long x = 600851475143L;
		long y = 0;

		while (true) {

			y = reduce(x);
			if (x==y) {break;}
			x=y;

		}

		System.out.println(y);
		
	}

	public static long reduce(long x) {     //takes int, divides out smallest divisor

		long a = sqrt(x);
		Boolean prime = true;

		for (long i = 2; i <= sqrt(x); i++) {   //finds smallest divisor
			if (x % i == 0){
				a=i;
				prime=false;
				break;
	
			}
		}
		
		if (prime){return x;}          //if no smallest divisor found, we're done
		return x/a;
	

	}

	public static int sqrt(long x) {
		
		int y = 0;
		for (int i = 1 << 15; i != 0; i >>>= 1) {
			y |= i;
			if (y > 46340 || y * y > x)
				y ^= i;
		}
		return y;
	}


}
