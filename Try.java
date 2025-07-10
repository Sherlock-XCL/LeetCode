public class Try {
    public static void main(String[] args) {
        char a = 'a';
        int[] x = new int[128];
        x[a] ++;
        for (int i = 0; i < x.length; i ++) {
            System.out.println(i + " " + x[i]);
        }
    }
}
