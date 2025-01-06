public class Q24_ByteOverflow {
    public  static void main(String[] args){

        byte maxByte = 127;
        byte minByte =-128;

        System.out.println("Initial maxByte: " + maxByte);
        System.out.println("Initial minByte: " + minByte);

        maxByte++;
        minByte--;

        System.out.println("Initial maxByte: " + maxByte);
        System.out.println("Initial minByte: " + minByte);

    }
}
