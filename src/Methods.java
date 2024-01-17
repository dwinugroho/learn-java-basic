public class Methods {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }


    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();

        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");

        int result = sum(10);
        System.out.println(result);
    }
}
