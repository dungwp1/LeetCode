import java.util.List;
import java.util.Stack;

public class D39_636 {
    public static int[] exclusiveTime(int n, List<String> logs) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        int preTime = 0;
        for (String log : logs) {
            String[] logArr = log.split(":");
            int id = Integer.parseInt(logArr[0]);
            String status = logArr[1];
            int currentTime = Integer.parseInt(logArr[2]);
            if ("start".equals(status)) {
                if (!stack.isEmpty()) {
                    int range = currentTime - preTime;
                    result[stack.peek()] += range;
                }
                stack.push(id);
                preTime = currentTime;
            } else {
                int range = currentTime + 1 - preTime;
                result[stack.peek()] += range;
                stack.pop();
                preTime = currentTime + 1;
            }
        }
        return result;
    }

}
