import java.util.*;
public class Rectangle{

    public static void rectangle(int l, int b){
        for(int i = 0;i<l;i++){
            for(int j = 0;j<b;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth of rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        rectangle(l,b);
    }
}


// * * * 
// * * * 
// * * * 
// * * * 
// * * * 
// * * * 
// * * * 


// * * * * * * * 
// * * * * * * * 
// * * * * * * *