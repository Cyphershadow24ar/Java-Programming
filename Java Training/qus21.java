//prints largest element in an array
public class qus21{
    public static void main(String[] args) {
        int[] arr={24,54,12,45,10,75,32,5};
        int lar=arr[0];
        for (int x:arr){
            if(x>lar){
                lar=x;
            }
    
        }
        System.out.println(lar);
    }
    
}