public class StudentMarks {
    public static void main(String[] args) {
        System.out.println("Find Percentage of student marks:");

        // Marks for 5 subjects
        double sub1 = 56.78, sub2 = 54.76, sub3 = 90.99, sub4 = 45.65, sub5 = 65.78;

        // Calculate total marks
        double totalMark = sub1 + sub2 + sub3 + sub4 + sub5;

        // Calculate percentage
        double percentage = (totalMark / 500) * 100;

        // Print percentage with two decimal places
        System.out.printf("Percentage is: %.2f%%\n", percentage);
    }
}
