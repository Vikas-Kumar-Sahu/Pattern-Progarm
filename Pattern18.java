import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=space; j++) {
				System.out.print(i+" ");
			}
			space--;
			System.out.println("  ");
		}
		
		sc.close();
	}

}


// 1 1 1 1 1   
// 2 2 2 2   
// 3 3 3   
// 4 4   
// 5   
