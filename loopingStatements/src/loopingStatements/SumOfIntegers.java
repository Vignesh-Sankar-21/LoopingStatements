package loopingStatements;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("enter a number");
		int num = inp.nextInt();
		inp.close();
		int sum =0;
		while(num!=0) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.print("sum of integers is:"+sum);
		}

}
