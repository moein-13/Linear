import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2,5, 5};
        System.out.println(find(arr, 1, 0));
        System.out.println(findIndex(arr, 5, 0));
        System.out.println(findIndex(arr, 5, 0));
        findAllIndex(arr,5,0);
        System.out.println(list);
    }
          /*linear search is true or false find it */
    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return (arr[index] == target) || find(arr, target, index + 1);

    }
             /*Find the target index */
    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }


    }
         /*Find the target index starting from the last index */
    static int findLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -69;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findLast(arr, target, index - 1);

        }
    }

    /* Find the multiple target on the list . */
static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);

    }

}
