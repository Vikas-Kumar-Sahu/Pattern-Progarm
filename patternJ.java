import java.util.Scanner;

public class patternJ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n/2+1;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++)
            if (i==1&&j!=n || i==n&&j<mid&&j!=1 || j==mid&&i!=n || j==1&&i>mid&&i!=n) 
                System.out.print("* ");
            else
                System.out.print("  ");
            System.out.println();
        }
        sc.close();
    }
}

// * * * * * * 
//       *
//       *
//       *
// *     *
// *     *
//   * *