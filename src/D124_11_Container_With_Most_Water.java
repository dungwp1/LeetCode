public class D124_11_Container_With_Most_Water {
    public int maxArea(int[] height) {
        int mostWater = 0;
        int l = 0, r = height.length - 1;
        while (l < r) {
            int hl = height[l];
            int hr = height[r];
            int water = (r - l) * Math.min(hl, hr);
            mostWater = Math.max(mostWater, water);
            if (hl <= hr) {
                while (l < r && height[l] <= hl) l++;
            } else {
                while (r > l && height[r] < hr) r--;
            }
        }
        return mostWater;
    }
}
