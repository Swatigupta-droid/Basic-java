// program showing Hierarchical Inheritance

// creating the base class(or superclass)
class BaseClass{
    int parentNum = 10;
    void display(){
        System.out.println("\nThis is BaseClass.\n");
    }
}

// creating the subclass1 that inherits the base class
class SubClass1 extends BaseClass{
    int num1 = 1;
    void callBaseClass(){
        display();
    }
}

// creating the subclass2 that inherits the base class
class SubClass2 extends BaseClass{
    int num2 = 2;
    void callBaseClass(){
        display();
    }
}

public class Practical_13{
  public static void main(String args[]){
    SubClass1 cob1 = new SubClass1 ();
    SubClass2 cob2 = new SubClass2 ();

    cob1.callBaseClass();
    System.out.println("parentNum * childNum1 = " + cob1.parentNum * cob1.num1);
    System.out.println("parentNum * childNum2 = " + cob2.parentNum * cob2.num2);	
  }
}
