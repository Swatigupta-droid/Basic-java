
public class student {
    private int rollNo;
    public String name; 

    // constructor-> public, no return type,name same as class name
    public student(String n, int rn){   // parameterized
        rollNo = rn;
        name = n;
    }
    public student(){} // default constructor

    public void setRollNo(int rn){
        rollNo = rn;
    }

    public int getRollNO(){
        return rollNo;
    }

    public void display(){
        System.out.println(name + " " + rollNo);
    }

    public void insertRecord(String n, int rn){
        name = n;
        rollNo = rn;
    }
}

// default -> can be accessed within the same package
// private  -> only with in the same class
// public -> visible everywhere
// protected -> in Inheritance


// keywords
// final-> dont want to change the value
// this -> this keyword
// static-> static variable ( object counter )