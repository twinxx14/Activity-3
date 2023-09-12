import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many grades would you like to enter? ");
        int finalGrade = scan.nextInt();

        double[] grades = new double[finalGrade];
        System.out.println("Input " + finalGrade + " final grades: ");
        for (int i = 0; i < finalGrade; i++) {
            grades[i] = scan.nextDouble();
        }

        while (true) {
            System.out.println("");
            System.out.println("--- Menu ---");
            System.out.println("1. Insertion Sort (Ascending)");
            System.out.println("2. Insertion Sort (Descending)");
            System.out.println("0. Exit");
            System.out.print("");

            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    Ascending(grades);
                    System.out.println("Grades in Ascending order:");
                    Print(grades, finalGrade);
                    break;
                case 2:
                    Descending(grades);
                    System.out.println("Grades in Descending order:");
                    Print(grades, finalGrade);
                    break;
                case 0:
                    System.out.println("-- Exiting Program --");
                    scan.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }

             
        }
    }

    // Print 
    public static void Print(double[] grades, int finalGrade) {

            for (int i = 0; i < finalGrade; i++) {
                System.out.print(grades[i] + " ");
            }
            System.out.println();
    }
    // Ascending Order
    public static void Ascending(double[] grades) {
        int num = grades.length;
        int i = 1;

        while (i < num) {
            double temp = grades[i];
            int j = i - 1;
            while (j >= 0 && grades[j] > temp) {
                grades[j + 1] = grades[j];
                j--;
            }
            grades[j + 1] = temp;
            i++;
        }
    }

    // Descending Order
    public static void Descending(double[] grades) {
        int num = grades.length;
        int i = 1;

        while (i < num) {
            double temp = grades[i];
            int j = i - 1;
            //change to less than
            while (j >= 0 && grades[j] < temp) {
                grades[j + 1] = grades[j];
                j--;
            }
            grades[j + 1] = temp;
            i++;
        }
    }
}// end of class Grade