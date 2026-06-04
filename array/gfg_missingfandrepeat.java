import java.util.*;

public class gfg_missingfandrepeat {

    public static ArrayList<Integer> findTwoElement(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int repeating = -1;
        int missing = -1;

        for (int i = 1; i <= n; i++) {
            if (!freq.containsKey(i)) {
                missing = i;
            }

            if (freq.getOrDefault(i, 0) == 2) {
                repeating = i;
            }
        }

        result.add(repeating);
        result.add(missing);

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};

        System.out.println(findTwoElement(arr));
    }
}