import java.util.Scanner;
// WAP to show single level inheritance.

class ParentClass1{
    String name;
    int rollNo;

    ParentClass1(){
        System.out.println("This is class 'test'.\n");
    }
}

public class Program_12 extends ParentClass1 {
    float grades;

    public void display(){
        System.out.println("\nName of the student: " + name);
        System.out.println("Roll no. of the student: " + rollNo);
        System.out.println("Grades of the student: " + grades);
    }
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Program_12 ob = new Program_12();
        System.out.print("Enter name of the student: ");
        ob.name = cin.next();
        System.out.print("Enter Roll number: ");
        ob.rollNo = cin.nextInt();
        System.out.print("Enter grades: ");
        ob.grades = cin.nextFloat();

        ob.display();
    }
}
