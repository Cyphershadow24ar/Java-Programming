// Write a program to get the output as per the mentioned series:
// 1+ ½ + ¼ + 1/8 + 1/16 ……
// The series should continue “N” number of times.
// Testcase-1
// Input: Enter “N” : 4
// 1 + ½ + ¼ + 1/8
// Output: 1.875

import java.util.Scanner;
class Series{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        Double sum=0.0;
        System.out.println("Enter the numbers :");
        Double N=s.nextDouble();
        for(int i=0;i<N;i++){
            sum=sum+(1/(Math.pow(2,i)));
        }
        System.out.println("Enter the numbers :" + sum);
    }
}