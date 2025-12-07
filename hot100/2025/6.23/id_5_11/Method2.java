import java.util.Scanner;

class Method2 {
    public static void main(String[] args) {
        int[] height;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        height = new int[n]; // 初始化数组
        for (int i = 0; i < n; i ++) {
            height[i] = sc.nextInt();
        }
        int area = maxArea(height);
        System.out.println(area);
        sc.close();
    }
    
    private static int maxArea(int[] height) { // 添加static关键字
        int area = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int s = (j - i) * h;
            if (s > area) area = s;
            if (height[i] < height[j]) i ++;
            else j --;
        }
        return area;
    }
}