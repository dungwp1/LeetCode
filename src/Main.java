import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> logs1 = List.of("0:start:0", "1:start:2", "1:end:5", "0:end:6");
        List<String> logs2 = List.of("0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7");
        List<String> logs3 = List.of("0:start:0", "0:start:2", "0:end:5", "1:start:6", "1:end:6", "0:end:7");
        List<String> logs4 = List.of("0:start:0", "0:end:0", "1:start:1", "1:end:1", "2:start:2", "2:end:2", "2:start:3", "2:end:3");
        List<String> logs5 = List.of("0:start:0", "1:start:5", "2:start:6", "3:start:9", "4:start:11", "5:start:12", "6:start:14", "7:start:15", "1:start:24", "1:end:29", "7:end:34", "6:end:37", "5:end:39", "4:end:40", "3:end:45", "0:start:49", "0:end:54", "5:start:55", "5:end:59", "4:start:63", "4:end:66", "2:start:69", "2:end:70", "2:start:74", "6:start:78", "0:start:79", "0:end:80", "6:end:85", "1:start:89", "1:end:93", "2:end:96", "2:end:100", "1:end:102", "2:start:105", "2:end:109", "0:end:114");

//        int[] result1 = D39_636.exclusiveTime(2, logs1);
//        int[] result2 = D39_636.exclusiveTime(1, logs2);
//        int[] result3 = D39_636.exclusiveTime(2, logs3);
//        int[] result4 = D39_636.exclusiveTime(3, logs4);
        int[] result5 = D39_636.exclusiveTime(8, logs5);

//        System.out.println(Arrays.toString(result1));
//        System.out.println(Arrays.toString(result2));
//        System.out.println(Arrays.toString(result3));
//        System.out.println(Arrays.toString(result4));
        System.out.println(Arrays.toString(result5));
    }
}
