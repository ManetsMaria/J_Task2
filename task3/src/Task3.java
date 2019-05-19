import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public boolean bar(String[] arg1, String[] arg2) {
        //use again null check, because this public method
        if (arg1 == null || arg2 == null || arg1.length != arg2.length)
                return false;
        Map<String, Integer> counter = new HashMap<>();
        for (String str: arg1){
            str = str.toLowerCase();
            counter.merge(str, 1, Integer::sum);
        }

        for (String str: arg2){
            str = str.toLowerCase();
            Integer count = counter.get(str);
            if (count == null || count == 0){
                return false;
            }
            counter.put(str, count - 1);
        }

        return true;
    }

    public boolean foo(String arg1, String arg2) {
        if(arg1 == null || arg2 == null){
            return false;
        }
        String[] first = arg1.split("\\W+");
        String[] second = arg2.split("\\W+");

        return bar(first, second);
    }
}
