import java.io.*;

public class Two {

	public static void main(String[] args) {

		int sum = 0;      //running total

		int three = 2;    //counts every third term

		int a = 1;        //first term
		int b = 2;        //second term
		int c = 0;        //temporary term

		while (a<4000000) {

			if (three==3){
			
				three=1;      //resets three counter
				sum=sum+a;    //adds first term to the sum

			}

			c=a+b;    //temporary holds the new fibonacci term
			a=b;      
			b=c;      //moves first and second terms along

			three++;  //increment counter
	
		}

		System.out.println(sum);
		
	}

}
