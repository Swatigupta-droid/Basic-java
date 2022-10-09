// program to overload add() method

public class Practical_14 {
    // two int type parameters
    static int add(int a, int b){
        return a+b;
    }
    // three int type parameters
    static int add(int a, int b, int c){
        return a+b+c;
    }
    // two float type parameters
    static float add(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
    
        int sum1 = add(3,9);
        int sum2 = add(5,7,6);
        float sum3 = add(34.98f,60.65f);

        System.out.println("\nSum1: " + sum1);
        System.out.println("Sum2: " + sum2);
        System.out.println("Sum3: " + sum3);
    }
    
}
