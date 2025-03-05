public class RotatedBinary {
    public static void main(String[] args) {
        System.out.println("The sum is :"+ sumi());
    }
    static int sumi(){
        int sum = 0;

        for (int i = 1; i <= 100 ; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
