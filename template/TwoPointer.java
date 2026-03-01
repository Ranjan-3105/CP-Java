public class TwoPointers {

    static void twoPointerExample(int[] arr) {
        int l = 0, r = arr.length - 1;

        while (l < r) {
            int sum = arr[l] + arr[r];

            if (sum == 10) {
                System.out.println("Found pair");
                l++;
                r--;
            } else if (sum < 10) {
                l++;
            } else {
                r--;
            }
        }
    }
}