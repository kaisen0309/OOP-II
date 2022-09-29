import java.util.*;

public class W2HW_treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        int tsSize = 0;
        System.out.println("電腦從1~100的整數中，亂數取出10個不重複的號碼....");
        while (ts.size() != 10) {
            int r = 0;
            r = (int) (Math.random() * 100) + 1;
            ts.add(r);
            if (ts.size() - tsSize == 1) {
                System.out.printf("第%d個號碼：%d\n", tsSize + 1, r);
                tsSize++;
            }
        }
        System.out.printf("物件內元素個數為：%d\n", ts.size());
        System.out.println("物件內元素的內容：" + ts);
        System.out.println("第一個元素內容為：" + ts.first());
        System.out.println("最後一個元素內容：" + ts.last());
        System.out.println("內容介於30~70者：" + ts.subSet(30, 71));
    }
}
