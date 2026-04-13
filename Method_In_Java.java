package JavaBasic;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Method_In_Java {

    /*

        Function ;-
                    Function is a Block Of Code to perform a Specific Task

        Method :-
                    Method is a Function that associated with an Object and Class

     */

    Scanner sc = new Scanner(System.in);
//     void myMethos(){
//        System.out.println("I am Om Ulhas Burse");
//    }

//    //Call to myMethod()
//    public void main(String[] args){
//        myMethos();



//    // Q.1 Write a Function To Print Your Name "N" Time;
//     public static void MyName(int N){
//        for(int i=1;i<=N;i++){
//            System.out.println("Om");
//
//        }
//    }
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter The Value of N : ");
//        int N = sc.nextInt();
//        MyName(N);
//    }


//     Q.2 Write a Function to print the Sum from 1 to N
//          public static void main(String[] args){
//          Scanner sc = new Scanner(System.in);
//          System.out.print("Enter The Value of N : ");
//          int N = sc.nextInt();
//          printSum( N);
//      }
//
//        public static void printSum(int N){
//          int Sum = 0;
//          for(int i =1;i<=N;i++){
//              Sum = Sum + i;
//        }
//        System.out.print("The Sum Is : " + Sum);
//    }



    // Q.3 Write a Function The Avg Of 2 Number
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Value Of A : ");
        int a = sc.nextInt();

        System.out.print("Enter The Value Of B : ");
        int b = sc.nextInt();
        Avgmethod(a,b);
    }

    static void Avgmethod(int a , int b){
        int avg = (a+b)/2;
        System.out.print("The Avg Of 2 A and B are : " + avg);
    }

}
