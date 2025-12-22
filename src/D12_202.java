import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D12_202 {
    public static boolean isHappy(int n) {
        Set<Integer> setNum = new HashSet<>();
        int copyNum = n;
        while (true) {
            List<Integer> listNum = new ArrayList<>();
            int index = 0, lastIndex = 0;
            int result = 0;

            while (copyNum > 0) {
                index = copyNum / 10;
                lastIndex = copyNum % 10;
                result += lastIndex * lastIndex;
                copyNum = index;
            }
            if (setNum.contains(result)) return false;
            if (result == 1) return true;
            setNum.add(result);
            copyNum = result;
        }
    }
}
