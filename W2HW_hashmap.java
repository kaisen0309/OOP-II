import java.util.*;
import java.util.Scanner;

public class W2HW_hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        Scanner input = new Scanner(System.in);
        int number = 0;
        hmap.put(1, "January");
        hmap.put(2, "February");
        hmap.put(3, "March");
        hmap.put(4, "April");
        hmap.put(5, "May");
        hmap.put(6, "June");
        hmap.put(7, "July");
        hmap.put(8, "August");
        hmap.put(9, "September");
        hmap.put(10, "October");
        hmap.put(11, "November");
        hmap.put(12, "December");

        do {
            System.out.printf("請輸入1~12？");
            number = input.nextInt();
            if (number < 1 || number > 12)
                System.out.println("範圍錯誤！");
        } while (number < 1 || number > 12);
        System.out.printf("第%d月的英文單字為%s\n", number, hmap.get(number));
    }
}
