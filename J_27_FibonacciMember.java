public class J_27_FibonacciMember {

    public static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static boolean isFibonaciMember(int n){
        int f;
        for(int i = 1; true; i++){
            f = fibo(i);
            if(f==n){
                return true;
            }
            if(f>n){
                return false;
            }
        }
    }
    public static void main(String[] args) {
        //execution time
        long start = System.nanoTime();

        System.out.println(isFibonaciMember(12));
        System.out.println(isFibonaciMember(13));

        long duration = (System.nanoTime() - start);
        System.out.println("\n\ntime taken: " + duration );
    }
    
}
