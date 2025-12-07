class Method1 {
    public int maxArea(int[] height) {
        int area = 0;
        int h, s;
        for (int left = 0; left < height.length; left ++) {
            for (int right = left + 1; right < height.length; right ++) {
                h = min(height[left], height[right]);
                s = h * (right - left);
                if (s > area) area = s;
            }
        }
        return area;
    }
    private int min(int i, int j) {
        if (i >= j) return j;
        else return i;
    }
}
