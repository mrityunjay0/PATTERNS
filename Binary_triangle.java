import java.util.*;
public class Binary_triangle {

    public static void binary(int n){
        for(int i = 0;i<n;i++){
            for(int j = 0;j<=i;j++){
                if((i%2==0 && j%2==0) || (i%2!=0 && j%2!=0)){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        binary(n);
    }    
}

// 1
// 01
// 101
// 0101
// 10101