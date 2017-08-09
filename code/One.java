import java.io.*;

public class One {

	public static void main(String[] args) {

		int sum = 0;         //running total
		int three = 1;       //counts to three
		int five = 1;        //counts to five

		for (int i=1; i<1000; i++){

			if (three==3){

				three=0;      //resets three counter
				sum=sum+i;    //adds i to the sum
	
			}

			if (five==5){

				five=0;               //resets five counter

				if (three!=1) {       //if i has not been added already
					sum=sum+i;    //adds i to the sum
				}
	
			}

			three++;
			five++;       //increment three and five

		}

		System.out.println(sum);
		
	}

}
