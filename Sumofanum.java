public class Sumofanum {
    public static void main(String[] args) {

        int ans = sum(10);
        System.out.println("The result of sum is : "+ ans);

    }
    static int sum (int n){
        if (n == 1){
            return 1;

        }
        else {
            return n + sum(n - 1);
        }
    }
}
