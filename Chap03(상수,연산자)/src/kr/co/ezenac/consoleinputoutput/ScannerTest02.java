package kr.co.ezenac.consoleinputoutput;

import java.util.Scanner;

/*
 *  입력 받은 두 수중에 큰 수를 출력하세요.
 *  입력1 :
 *  입력2 :
 *  10
 */


public class ScannerTest02 {

	public static void main(String[] args) {
		
		int max;
		System.out.println("입력 받은 두수중에 큰 수를 출력하세요.");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		
		int num1 = scan.nextInt();
		
		System.out.print("입력2 : ");
		
		int num2 = scan.nextInt();
		
		max = (num1 > num2) ? num1 : num2;
		
		System.out.println("큰 수 : " + max);
		
		
		
		scan.close();
	}

}
