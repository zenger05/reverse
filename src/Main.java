import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        Scanner scannerLine = new Scanner(in);
        while (scannerLine.hasNextInt()) {
            ar.add(Integer.toString(scannerLine.nextInt()));
        }
        String[] ac = reverseString(ar);
        String[] ac1 = reverseChar(ac);
        System.out.println(Arrays.toString(ac1));


    }

    public static String[] reverseString(ArrayList<String> strings) {
        String[] nums = new String[strings.size()];
        int j = 0;
        for(int i = nums.length - 1; i >= 0; i--) {
                nums[j] = strings.get(i);
                j++;
        }
        return nums;

    }

    public static String[] reverseChar(String[] str) {
        String[] nums2 = new String[str.length];
        for(int i = 0; i < str.length; i++) {
            StringBuilder sb = new StringBuilder(str[i]);
            nums2[i] = sb.reverse().toString();
        }

        return nums2;
    }



}

