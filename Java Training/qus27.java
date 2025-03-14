// wap code for encoding 
// input - ANIKET RAJ
// output - 199289
// explanation : - A = 0 , T =19 -> A-T = 0-19 = |-19| = 19
// N = 13, E =4 -> N-E = 9 
// I = 8, K =10 -> I-K = 8-10 = |-2| = 2
// R= 17 , J =9 -> R-J = 17-9 = 8
// A = 0 , NOW IF ONLY LETTER IS LEFT THEN WE WILL COUNT THE NUMBER OF CHAR AND THEN SUBTRACT IT. -> A-COUNT = 0-9=|-9| = 9

public class qus27 {
    public static void main(String[] args) {
        String input = "ANIKET RAJ";
        System.out.println("Encoded Output: " + encodeString(input));
    }

    public static String encodeString(String input) {
        input = input.replaceAll(" ", ""); // Remove spaces
        int length = input.length();
        StringBuilder encoded = new StringBuilder();

        for (int i = 0; i < length - 1; i += 2) {
            int diff = Math.abs(getAlphabetValue(input.charAt(i)) - getAlphabetValue(input.charAt(i + 1)));
            encoded.append(diff);
        }

        // If only one character remains, subtract the total count
        if (length % 2 != 0) {
            int lastValue = getAlphabetValue(input.charAt(length - 1));
            int diff = Math.abs(lastValue - length);
            encoded.append(diff);
        }

        return encoded.toString();
    }

    public static int getAlphabetValue(char ch) {
        return Character.toUpperCase(ch) - 'A';
    }
}



