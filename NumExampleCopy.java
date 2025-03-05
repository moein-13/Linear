public class NumExampleCopy {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n ){

        // Base condition
        if (n == 5) {
            System.out.println(5);
            return;

        }

        System.out.println(n);

        // if U calling a function again and again then U can treat it like separate call in the stack.
        print(n+1);
    }
}

// solve using recursion , it is the same problem before example but the way to solve the que is different.