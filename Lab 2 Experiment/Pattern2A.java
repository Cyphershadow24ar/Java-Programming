// Write the Program to print the following patterns :
// *
// *
// *
// * * *
// *
// * * * * *
// *
// * * * * * * *
// Input- 8

import java.util.Scanner;
class Pattern2A{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int row=s.nextInt();

    for(int i =1;i<=row;i++){
        if(i%2==0){
            for(int j=1;j<i;j++){
                System.out.print("* ");
            }

        }
        else{
            System.out.print("*");
        }
        System.out.println();

        }

    }
}