package StudentDatabase;

import java.util.Arrays;
import java.util.Scanner;

public class StudentDatabase {


    public static void main(String[]args)
    {

        System.out.println("How many users do you want?");
        Scanner in = new Scanner(System.in);
        int totUsers = in.nextInt();
        
        Student[] students = new Student[totUsers];

        for(int i=0; i< students.length; i++)
        {

            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
            System.out.println(students[i].toString());


        }

    }
    
}
