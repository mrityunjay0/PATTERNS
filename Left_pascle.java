import java.util.*;
public class Left_pascle {

    public static void pascle(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1;i>0;i--){
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        pascle(n);
    }
}


// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *