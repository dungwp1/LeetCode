public class D131_97_Interleaving_String {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        Boolean[][] memo = new Boolean[s1.length() + 1][s2.length() + 1];
        return check(memo, s1, s2, s3, 0, 0);
    }

    //  Chức năng: kiểm tra xem các chuỗi bắt đầu từ i1 và i2 cho tạo thành chuỗi từ i3 được không.
    private boolean check(Boolean[][] memo, String s1, String s2, String s3, int i1, int i2) {
        if (i1 == s1.length() && i2 == s2.length()) return true;
//      Ô i1 i2 đã được check -> return
        if (memo[i1][i2] != null) return memo[i1][i2];
//      Ô i1 i2 chưa được check -> tính toán ô i1 i2 và return
        int i3 = i1 + i2;
        boolean ans = false;
        if (i1 < s1.length() && s3.charAt(i3) == s1.charAt(i1)) {
            ans = check(memo, s1, s2, s3, i1 + 1, i2);
        }
        if (!ans && i2 < s2.length() && s3.charAt(i3) == s2.charAt(i2)) {
            ans = check(memo, s1, s2, s3, i1, i2 + 1);
        }
        memo[i1][i2] = ans;
        return ans;
    }
}
