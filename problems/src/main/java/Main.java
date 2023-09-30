import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //printingPatterns();
        countingBits();
    }

    public static void printingPatterns() {
        int n = 5;
        int count = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j += 1) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }


    public static void countingBits() {
        Function<Integer, Integer> count = (n) -> {
            int counter = 0;
            for (int i = 0; i < 32; i++) {
                int x = n & 1;
                if (x % 2 == 1) {
                    counter++;
                }
                n = n >> 1;
            }
            return counter;
        };

        int n = 5;
        int x = 0;
        List<Integer> arrList = new ArrayList<>();
        while (x <= n) {
            arrList.add(count.apply(x));
            x++;
        }
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            arr[i] = arrList.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }

}
