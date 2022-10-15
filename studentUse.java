
import java.util.Scanner;

public class studentUse {
    public static void main(String[] args) {
    
        Scanner cin = new Scanner(System.in);

        student obj1 = new student();
        student obj2 = new student();

        student objArr[] = new student[3];
    
        System.out.println(obj1);

        obj1.name = "bunty";
       // obj1.rollNo = 07;
        obj1.setRollNo(7);

        obj2.name = "bunty2";
        //obj2.rollNo = 06; 
        obj2.setRollNo(6);

        System.out.println(obj1.name + " " + obj1.getRollNO());
        System.out.println(obj2.name + " " + obj2.getRollNO());

        student obj3 = new student("car", 777);
        System.out.println(obj3.name + " " + obj3.getRollNO());

        obj3.display();

    }
    
}
