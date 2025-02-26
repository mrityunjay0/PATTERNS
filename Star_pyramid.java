import java.util.*;
public class Star_pyramid {

    public static void pyramid(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k = 0;k<2*i+1;k++){
                System.out.print("*");
            }
            for(int l = 0;l<n-i-1;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        pyramid(n);
    }
}


//     *    
//    ***   
//   *****  
//  ******* 
// *********

// SPACE = n-i-1
// STARS = 2*i+1
// SPACE = n-i-1