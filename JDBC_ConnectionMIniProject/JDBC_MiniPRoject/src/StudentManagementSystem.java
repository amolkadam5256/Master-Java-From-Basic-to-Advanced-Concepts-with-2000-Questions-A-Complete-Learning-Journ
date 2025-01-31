import java.sql.*;
import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        try {
            // Load the MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            String url = "jdbc:mysql://localhost:3306/mydb"; // Replace with your database name
            String user = "root"; // Replace with your MySQL username
            String password = "amolkadam7709"; // Replace with your MySQL password

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successful!");

            // Create database and table if not already created
            createDatabase(conn);
            createTable(conn);

            // Scanner for user interaction
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nStudent Management System");
                System.out.println("1. Create Student");
                System.out.println("2. Show Students");
                System.out.println("3. Update Student");
                System.out.println("4. Remove Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        // Create a new student
                        System.out.print("Enter student name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter student age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter student grade: ");
                        String grade = scanner.nextLine();
                        System.out.print("Enter student marks: ");
                        int marks = scanner.nextInt();
                        insertStudentData(conn, name, age, grade, marks);
                        break;

                    case 2:
                        // Show students
                        retrieveStudentData(conn);
                        break;

                    case 3:
                        // Update a student's grade or marks
                        System.out.print("Enter student ID to update: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new grade: ");
                        String newGrade = scanner.nextLine();
                        System.out.print("Enter new marks: ");
                        int newMarks = scanner.nextInt();
                        updateStudentData(conn, id, newGrade, newMarks);
                        break;

                    case 4:
                        // Remove a student
                        System.out.print("Enter student ID to remove: ");
                        int removeId = scanner.nextInt();
                        deleteStudentData(conn, removeId);
                        break;

                    case 5:
                        // Exit the system
                        System.out.println("Exiting...");
                        conn.close();
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice, please try again.");
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // Create database if it doesn't exist
    public static void createDatabase(Connection conn) {
        try {
            String query = "CREATE DATABASE IF NOT EXISTS mydb";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Database created or already exists.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create table if it doesn't exist
    public static void createTable(Connection conn) {
        try {
            String query = "CREATE TABLE IF NOT EXISTS Students (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(100)," +
                    "age INT," +
                    "grade VARCHAR(10)," +
                    "marks INT DEFAULT 0)";  // Added marks field with default value
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table created or already exists.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Insert student data
    public static void insertStudentData(Connection conn, String name, int age, String grade, int marks) {
        try {
            String query = "INSERT INTO Students (name, age, grade, marks) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, grade);
            pstmt.setInt(4, marks);
            pstmt.executeUpdate();
            System.out.println("Student data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Retrieve student data
    public static void retrieveStudentData(Connection conn) {
        try {
            String query = "SELECT * FROM Students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            if (!rs.isBeforeFirst()) {
                System.out.println("No students found.");
            }
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Age: " + rs.getInt("age"));
                System.out.println("Grade: " + rs.getString("grade"));
                System.out.println("Marks: " + rs.getInt("marks"));
                System.out.println("-------------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Update student data
    public static void updateStudentData(Connection conn, int id, String grade, int marks) {
        try {
            String query = "UPDATE Students SET grade = ?, marks = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, grade);
            pstmt.setInt(2, marks);
            pstmt.setInt(3, id);
            pstmt.executeUpdate();
            System.out.println("Student data updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete student data
    public static void deleteStudentData(Connection conn, int id) {
        try {
            String query = "DELETE FROM Students WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Student data deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
