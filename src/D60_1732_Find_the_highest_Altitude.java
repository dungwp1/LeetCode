public class D60_1732_Find_the_highest_Altitude {
    public static int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int largestAltitude = 0;
        for (int i : gain) {
            currentAltitude += i;
            largestAltitude = Math.max(largestAltitude, currentAltitude);
        }
        return largestAltitude;
    }
}
