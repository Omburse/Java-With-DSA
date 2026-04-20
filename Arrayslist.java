package JavaBasic;
import java.util.Scanner;

public class Arrayslist {
    // public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        // User Input
//        int marks [] = new int[3];
//        System.out.print("Enter Your Physics Marks : ");
//        marks [0] = sc.nextInt();
//        System.out.print("Enter Your Chemistry Marks : ");
//        marks [1] = sc.nextInt();
//        System.out.print("Enter Your Maths Marks :  ");
//        marks [2] = sc.nextInt();
//
//        // Print output
//        System.out.println("Physics Marks is : " + marks[0]);
//        System.out.println("Chemistry Marks is : " + marks[1]);
//        System.out.println("Maths Marks is : " + marks[2]);
//
//        System.out.println("The total Average is " + (marks[0]+marks[1]+marks[2])/3);
//        System.out.print("The Length of array is : " + marks.length);
//
    public static int getLargest(int number[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++)
        {
            if(largest<number[i]){
                largest=number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
    int number[] = {1,2,6,3,5};
        System.out.println("The largest Value is : " + getLargest(number));
    }
}
