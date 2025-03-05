public class CountSteps {
    public static void main(String[] args) {
        int ans = numofSteps(41);
        System.out.println(ans);

    }
    public static int numofSteps( int n){
        return helper(n , 0);
    }
    private static int helper(int n , int steps){
        if (n == 0){
            return steps;
        }
        if ( n % 2  == 0){
            return helper(n/2 , steps + 1);
        }
        return helper(n -1 , steps + 1);
    }
}

// Leetcode easy problem .