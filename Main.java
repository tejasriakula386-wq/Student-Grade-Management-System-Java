import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int choice;

        System.out.println("===== Student Grade Management System =====");
        System.out.println("1. Calculate Student Result");
        System.out.println("2. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:

                sc.nextLine();

                // Student Details
                System.out.print("Enter Student Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Roll Number: ");
                int rollNo = sc.nextInt();

                // Number of Subjects
                System.out.print("Enter Number of Subjects: ");
                int n = sc.nextInt();

                sc.nextLine();

                // Arrays
                String subjects[] = new String[n];
                int marks[] = new int[n];

                int sum = 0;
                double average;
                double percentage;

                boolean fail = false;

                // Subject Names Input
                System.out.println("\nEnter Subject Names:");

                for(int i = 0; i < n; i++) {

                    System.out.print("Subject " + (i + 1) + ": ");
                    subjects[i] = sc.nextLine();
                }

                // Marks Input
                System.out.println("\nEnter Marks:");

                for(int i = 0; i < n; i++) {

                    System.out.print(subjects[i] + ": ");
                    marks[i] = sc.nextInt();

                    sum += marks[i];

                    if(marks[i] < 35) {
                        fail = true;
                    }
                }

                // Calculations
                average = sum / (double)n;
                percentage = (sum / (double)(n * 100)) * 100;

                // Output
                System.out.println("\n===== Student Result =====");

                System.out.println("Student Name : " + name);
                System.out.println("Roll Number  : " + rollNo);

                System.out.println("\nSubject Marks:");

                for(int i = 0; i < n; i++) {

                    System.out.println(subjects[i] + " : " + marks[i]);
                }

                System.out.println("\nTotal Marks : " + sum);
                System.out.println("Average     : " + average);
                System.out.println("Percentage  : " + percentage + "%");

                // Grade Calculation
                if(average >= 90) {

                    System.out.println("Grade        : A");
                }

                else if(average >= 75) {

                    System.out.println("Grade        : B");
                }

                else if(average >= 50) {

                    System.out.println("Grade        : C");
                }

                else {

                    System.out.println("Grade        : Fail");
                }

                // Pass/Fail Result
                if(fail) {

                    System.out.println("Result       : Fail in one or more subjects");
                }

                else {

                    System.out.println("Result       : Pass");
                }

                break;

            case 2:

                System.out.println("Program Exited");
                break;

            default:

                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}