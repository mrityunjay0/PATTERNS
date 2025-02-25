import java.util.*;
public class Numbered_Triangle {

    public static void triangle(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        triangle(n);
    }
}


// 1 
// 2 2 
// 3 3 3 
// 4 4 4 4 
// 5 5 5 5 5