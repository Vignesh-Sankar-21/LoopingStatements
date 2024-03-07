package loopingStatements;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("enter a number");
		int num = inp.nextInt();
		inp.close();
		boolean isprime = true;
		if(num<=1) {
			isprime=false;
		}
		else {
			for(int i =2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					isprime=false;
					break;
				}
			}
		}
		if(isprime) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
			
		}
	}

}
