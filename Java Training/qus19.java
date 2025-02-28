//swaps first and last element of a given array
public class qus19{
    public static void main(String[] args) {
        int[] arr={1,3,4,4,4,2,5,6,3,2,6};
        for(int i=0;i<=arr.length-1;i++){
        System.out.print("\t" + arr[i]);}
        int temp=arr[0];
        arr[0]=arr[arr.length - 1];
        arr[arr.length - 1]=temp;
        System.out.println();
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("\t" + arr[i]);}
    
    }
}