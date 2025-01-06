public class Q12_ASCII {
    public static void main(String[] args) {

        char[] characters = new char[] {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',  // lowercase a to z
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',  // uppercase A to Z
                '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_', '{', '|', '}', '~' // common symbols
        };

        System.out.println("Size of array: " + characters.length);
        int asci = (int) characters[2];
        System.out.println("Character value of : " + characters[2] + " -> ASCII Value: " + asci);

        for (char c : characters) {
            int asciiValue = (int) c;
            System.out.println("Character: " + c + " -> ASCII Value: " + asciiValue);
        }
    }
}
