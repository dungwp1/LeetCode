import java.util.Arrays;

public class D4_238 {
    public static int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;
        }
        int[] right = Arrays.copyOf(answer, answer.length);
        for (int i = 1; i < nums.length; i++) {

            answer[i] = answer[i - 1] * nums[i - 1];
        }
        System.out.println("Check left" + Arrays.toString(answer));
        for (int i = nums.length - 2; i >= 0; i--) {
            right[i] = nums[i + 1] * right[i + 1];
            answer[i] *= right[i];
        }
        System.out.println("Check right" + Arrays.toString(right));

        return answer;
    }
}
