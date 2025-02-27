import java.util.*;
public class Star_diamond {

    public static void diamond(int n){
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
        for(int i = n-1;i>=0;i--){
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
        diamond(n);
    }    
}


//          *         
//         ***        
//        *****       
//       *******      
//      *********     
//     ***********    
//    *************   
//   ***************  
//   ***************  
//    *************   
//     ***********    
//      *********     
//       *******      
//        *****       
//         ***        
//          *         