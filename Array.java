import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in the array ");
        n= sc.nextInt();

        int a[] =new int [n];

        //entering array
        System.out.println("Enter the elemets");
        for(int i = 0; i<n; i++){
            a[i]=sc.nextInt();
        }

        // printing array
        System.out.println("Your array is :");
        for(int i=0; i<n; i++){
            System.out.println("Element "+(i+1)+" is : "+a[i]);
        }

        //entering element in the array
        int c,d;
        int b[]=new int[n+1];
        System.out.println("Enter the element You want to enter in the array");
        c = sc.nextInt();

        System.out.println("Enter the position where you want to enter the number in the array");
        d = sc.nextInt();

        if (d > b.length) {
            System.out.println("Enter valid array index");
        }
        else{
            for(int i=0; i<n+1; i++){
                if (i < d) {
                    b[i] = a[i];
                }
                else if (i == d) {
                    b[i] = c;
                }
                else{
                    b[i] = a[i-1];
                }
            }

        System.out.println("Updated array is :");
        for(int i=0; i<n+1; i++){
            System.out.println("Element "+(i+1)+" is : "+b[i]);
        }
        }
        
    }
}