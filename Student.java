package StudentDatabase;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = "";
    private int tutionBalance = 0;
    private static int costOfCourse = 600;
    private static int id = 1001;

    // auto prompt enter students name and year
    public Student() {

        // each user should have their own ID, static gen on creation

        Scanner in = new Scanner(System.in);
        System.out.println("Enter student firstname");
        this.firstName = in.nextLine();

        System.out.println("Enter student lastname");
        this.lastName = in.nextLine();

        System.out.println("1 for 1stYear \n2 for 2ndYear \n3 for 3rdYear \n");
        this.gradeYear = in.nextInt();

        setStudentID();


    }

    private void setStudentID() {
        id++;

        this.studentID = gradeYear + "" + id;

    }

    public void enroll()
    {
        do{
        System.out.println("Enter a course to Enroll (Q to quit)");
        Scanner in = new Scanner(System.in);
        String course = in.nextLine();

        if(!course.equals("Q") && !course.equals("q") )
        {
            courses = courses + "\n" + course;
            tutionBalance += costOfCourse;

        }

        else
        {
            break;
        }
    }while (1 != 0);



        System.out.println("ENROLLED IN " + courses);
        System.out.println("TUITION BALANCE " + tutionBalance);



    }

    //View balance 
    public void viewBalance(){

        System.out.println("Your balance is " + tutionBalance  );
    }


    public void payTuition(){
        System.out.println("Enter your payment");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tutionBalance = tutionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();

    }

    public String toString(){

        return "Name: " + firstName + " " + lastName +
        "\nGrade Level " + gradeYear + 
        "\nStudentID " + studentID +
        "\nCourses Enrolled: " + courses
        + "\nBalance: $: " + tutionBalance;
    }

}
