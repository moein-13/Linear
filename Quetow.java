public class Quetow {
    public static void main(String[] args) {
        //funny(5);
        //fun(5);
        funboth(5);
    }

    static void fun(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        fun(n - 1);

    }

    static void funny(int n) {

        if (n == 0) {
            return;
        }

        funny(n - 1);
        System.out.println(n);
    }

    static void funboth(int n) {

        if (n == 0) {
            return;
        }

        System.out.println(n);
        funboth(n - 1);
        System.out.println(n);
    }
}
