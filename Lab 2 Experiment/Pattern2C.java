// Write a program to print the following patterns:
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5
// For the input 5

import java.util.Scanner;
class Pattern2C{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row=s.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}