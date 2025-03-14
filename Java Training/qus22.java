public class qus22 {
    public static void main(String[] args) {
        String name = "Aniket";
        long ph = 7481069628L;
        int yearr = 2005;

        char[] charArray = name.toCharArray();
        char[] pass = new char[4]; 


        for (int i = 0; i < 4; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') { 
                pass[i] = (char) (charArray[i] - 32); 
            } else {
                pass[i] = charArray[i]; 
            }
        }
        int min=9999;
        while(ph>=1000){
            int lst=(int)(ph%1000);
            if(lst>=100 && lst<min){
                min=lst;
            }
            ph=ph/10;}
        int last=0;

        String year = Integer.toString(yearr);
        for(int i=0;i<year.length();i++){
            int dig=year.charAt(i) - '0';
            if(dig%2==0){
                last=dig;
                break;
            }

        }

        // // Print the uppercase password
        // for (char ch : pass) {
        //     System.out.print(ch);
        // }
        // System.out.print(min);
        // System.out.print(last);
        
        String res = new String(pass)+min+last;
        System.out.println(res);
    }
}