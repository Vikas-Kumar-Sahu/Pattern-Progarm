package javaworld;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("Not Possible !!!");
			return ;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		sc.close();
	}

}

// *       * 
//   *   *   
//     *     
//   *   *   
// *       * 