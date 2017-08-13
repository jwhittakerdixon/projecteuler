import java.io.*;

public class Problem005 {

	public static void main(String[] args) {

		int i = 1;

		while (solution(i)==false) {

			i++;

		}

		System.out.println(i);

	}

	public static Boolean solution(int i) {

		for (int j = 1; j<=20; j++) {

			if (i % j != 0) {return false;}

		}

		return true;
	
	}

}
