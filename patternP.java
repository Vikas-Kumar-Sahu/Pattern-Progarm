import java.util.Scanner;

public class patternP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
            if (j==1 || i==mid&&j<mid || i==1&&j<mid || j==mid&&i<mid&&i!=1) 
                System.out.print("* ");
            else
                System.out.print("  ");
            System.out.println();
        }
        sc.close();
    }
}

// * * *
// *     *
// *     *
// * * *
// *
// *
// *
