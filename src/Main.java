public class Main {
    public static void main(String[] args) {
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures2 = {30, 40, 50, 60};
        int[] temperatures3 = {30, 60, 90};
        int[] result1 = D23_739.dailyTemperatures(temperatures1);
        int[] result2 = D23_739.dailyTemperatures(temperatures2);
        int[] result3 = D23_739.dailyTemperatures(temperatures3);

        for (int i : result1) {
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i : result2) {
            System.out.println(i);
        }
        System.out.println("------------");
        for (int i : result3) {
            System.out.println(i);
        }
    }
}
