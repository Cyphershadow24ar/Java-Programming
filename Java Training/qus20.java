//prints the smallest element in a given array
public class qus20{
    public static void main(String[] args) {
        int[] arr={24,54,12,45,10,75,32,5};
        int small=arr[0];
        for (int x:arr){
            if(x<small){
                small=x;
            }
    
        }
        System.out.println(small);
    }
}