import java.io.*;

public class Problem006 {

	public static void main(String[] args) {

		int sumFirst = 0;
		int squareFirst = 0;

		for (int i = 1; i<=100; i++) {

			sumFirst=sumFirst+i;
			squareFirst = squareFirst+(i*i);

		}

		sumFirst=sumFirst*sumFirst;

		System.out.println(sumFirst-squareFirst);

	}

	public static Boolean solution(int i) {

		for (int j = 1; j<=20; j++) {

			if (i % j != 0) {return false;}

		}

		return true;
	
	}

}
