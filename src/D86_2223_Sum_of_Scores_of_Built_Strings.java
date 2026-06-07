public class D86_2223_Sum_of_Scores_of_Built_Strings {
    public long sumScores(String s) {
        int n = s.length();
        long score = n;
        long[] hashArray = new long[n];
        long[] powerArray = new long[n];
        long B = 31, M = 1000000007;

        hashArray[0] = s.charAt(0) - 'a' + 1;
        powerArray[0] = 1;

        for (int i = 1; i < n; i++) {
            hashArray[i] = (hashArray[i - 1] * B + s.charAt(i) - 'a' + 1) % M;
            powerArray[i] = (powerArray[i - 1] * B) % M;
        }

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(0)) {
                int low = 1; // số kí tự trùng tối thiểu
                int high = n - i; // số kí tự trùng tối đa (n-i) là độ dài của chuỗi sk
                int countMax = 0;
                while (low <= high) {
                    int mid = (high - low) / 2 + low;
                    long hashGoc = hashArray[mid - 1];
                    long hashCon = (hashArray[i + mid - 1] - (hashArray[i - 1] * powerArray[mid]) % M + M) % M;
                    if (hashCon == hashGoc) {
                        countMax = mid;
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }
                score += countMax;
            }
        }
        return score;
    }
}
