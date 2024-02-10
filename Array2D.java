import java.util.Scanner;

public class Array2D {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);

        //2D Array
        int e,f;
        System.out.println("Enter number of rows in the array");
        e = sc.nextInt();
        
        System.out.println("Enter number of columns in the array");
        f = sc.nextInt();

        int x[][] = new int[e][f];

        System.out.println("Enter elements in an array");
        for(int i=0; i<e; i++){
            for(int j=0; j<f; j++){
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Total number of elements in an array is : "+(e*f));

        System.out.println("Entered Elements are :");
        for(int i=0; i<e; i++){
            for(int j=0; j<f; j++){
                System.out.println("Element "+(i+1)+" "+(j+1)+" is : "+x[i][j]);
            }
        }
    }
}
