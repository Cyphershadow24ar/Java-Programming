// Write a java program to check if a number is divisible by sum of its digits or not. Print “Yes”, if found divisible otherwise print “No”.
// Test Case 1 : Input "Enter a number:18" 
// Sum of digits is 1+8=9
// 18/9 =2, Remainder = 0(Exact division)
// Output: yes

import java.util.Scanner;
class Check{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int in;
        int sum=0;
        System.out.print("Enter the element :");
        in=s.nextInt();
        int input=in;
        while(in>0){
            int r=in%10;
            sum=sum+r;
            in=in/10;
        }
        if(input%sum==0){
            System.out.println("YES the given Number is divisible by the Sum of its digits.");
        }
        else{
            System.out.println("NO" the given Number is divisible by the Sum of its digits.");
        }
    }
}

