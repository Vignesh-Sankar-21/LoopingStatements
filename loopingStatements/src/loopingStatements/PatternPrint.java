package loopingStatements;

import java.util.Scanner;

public class PatternPrint {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("enter the number of rows");
		int num = input.nextInt();
		input.close();
		for(int i = num;i>=1;i--) {
			for(int j = 1;j<=i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}

	}

}
