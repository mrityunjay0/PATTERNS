import java.util.*;
public class Rhombus_left{

    public static void rhombus(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<n-1;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        rhombus(n);
    }
}

//     *
//    **
//   ***
//  ****
// *****
// ****
// ***
// **
// *