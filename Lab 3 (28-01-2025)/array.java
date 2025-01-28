public class array {
    public static void main(String[] args) {
        // 1D array
        //declaration of array
        int x[]={1,2,3,4};
        for(int i=0;i<x.length;i++){
            System.out.println(x[i]);
        }
        //Creating an uninitialized array
        int y[] =new int[5];// this allows the array in java to be dynamic in nature
        for(int i=0;i<x.length;i++){
            System.out.println(y[i]);
        }
        //2D array (of equal no of rows and columns)
        int z[][]=new int[2][2];    // this is allowes ofc
        // int z[][]=new int[2][];    // this too is allowed kyuki no of rows pe array ka structure determine hota hai and this is what allows us to create the jagged arrays 
        // int z[][]=new int[][2];    // But this on the other hand is no allowed
        //  kyuki unlike rows columns are not necessary for the structure of the array itself they are just there to support the rows        
        //Jagged array
        int a[][]=new int[2][3];
        for(int i =0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

        //2D array (of uneven rows and columns)
        int b[][]= new int[3][];
        b[0]= new int[1];
        b[1]= new int[2];
        b[2]= new int[3];
        for(int i =0;i<b.length;i++){
            for(int j=0;j<b[i].length;j++){
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }



    }

}
// unlike c and c++ : In java variable length array is allowed 
// these are called JAGGED array  c