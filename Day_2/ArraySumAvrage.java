 class ArraySumAverage {
    public static void main(String[] args) {
        System.out.println("Welcome to array sum and average:");
        int[] numArray = arraysUtility.inputArray();

        long sum = sum(numArray);
        double average = average(numArray);
        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              is: " + average);
    }

    public static long sum(int[] numArray){
        long sum = 0;
        int i =0 ;
        while (i< numArray.length){
            sum = sum + numArray[i];
            i++;

        }
        return sum;
    }

    public static double average(int[] numArray){
        long sum = sum(numArray);
        return (double) sum / numArray.length;
    }

}
