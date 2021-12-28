package linear_search;

import java.util.ArrayList;
import java.util.List;

public class Linear_Search {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add("EEE");
        list.add("FFF");

        System.out.println(search(list, "FFF"));
    }

    private static int search(List<String> list, String arg) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(arg)) {
                return i;
            }
        }
        return -1;
    }
}
