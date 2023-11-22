public class IncrementDecrement {

    public static void main(String[] args) {
        int x = 10;
        int w = x++ + x++ + x++ - (--x - --x - --x);
        System.out.println("x = " + x);
        System.out.println("w = " + w);

        double a = 10.26;
        char b = 'A';
        int c = 3;
        System.out.println( a % c + b);

    }
    

}
