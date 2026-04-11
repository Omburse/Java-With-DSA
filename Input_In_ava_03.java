import java.util.Scanner;

public class Input_In_ava_03 {
    static void main(String[] args) {
        //Create an Object of Scanner
        Scanner sc = new Scanner(System.in);
        /*
        //Taking Input Of User for value a
        System.out.print("Enter Value of a : ");
        int a = sc.nextInt();

        //Taking Input Of User for value b
        System.out.print("Enter Value of b : ");
        int b = sc.nextInt();

        //The Sum of Value a and b
        int Sum = a * b;
        System.out.println("The Sum of A and B are : " + Sum);
         */

        // Calculate a Area of Circle Using User Input
        System.out.print("Enter the value of Radius : ");
        int r = sc.nextInt();
        float area = 3.14f*r*r;
        System.out.println(area);



    }
}
