public class typeCasting {
    public static void main(String[] args){
        System.out.println("Type Casting ! \n");
        System.out.println("Type casting is when you assign a value of one primitive data type to another type.\n" +
                "\n" +
                "In Java, there are two types of casting:\n" +
                "\n" +
                "Widening Casting (automatically) - converting a smaller type to a larger type size\n" +
                "byte -> short -> char -> int -> long -> float -> double\n" +
                "\n" +
                "Narrowing Casting (manually) - converting a larger type to a smaller size type\n" +
                "double -> float -> long -> int -> char -> short -> byte");



                // Set the maximum possible score in the game to 500
                int maxScore = 500;

                // The actual score of the user
                int userScore = 423;

    /* Calculate the percantage of the user's score in relation to the maximum available score.
    Convert userScore to float to make sure that the division is accurate */
                float percentage = (float) userScore / maxScore * 100.0f;

                // Print the result
        System.out.println("User's percentage is " + percentage);


    }
}
