public class qus18{
    public static void main(String[] args) {
        int[] arr={12,35,13,56,42};
        int sum=0;
        int count=0;
        for (int x : arr){
            System.out.print("\t" + x);
            sum+=x;
            count++;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println(count);
    }
    
}