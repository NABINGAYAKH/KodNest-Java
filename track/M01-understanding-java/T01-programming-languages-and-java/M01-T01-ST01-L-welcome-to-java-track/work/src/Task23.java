public class Task23 {
    public static void main(String[] args) {
        // while loop
        // 6 means skip

        int i = 1;
        while (i <= 10) {
            if (i == 6) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
