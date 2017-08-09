import java.io.*;

public class Three {

	public static void main(String[] args) {

		double x = 13195;
		double y = 0;

		while (true) {

			y = reduce(x);
			if (x==y) {break;}
			x=y;

		}

		System.out.println(y);
		
	}

	public static double reduce(double x) {     //takes int, divides out smallest divisor

	double a = 2;
	double b = 0;

		while (true) {

			b=x/a;
			if (b==Math.floor(b)) {
				break;
			}
			a++;

		}

	if (b==1){return x;}
	return b;

	}


}
