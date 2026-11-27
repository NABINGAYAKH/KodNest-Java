public class Task24 {
    public static void main(String[] args) {
        // do while
        // skip 7

        int i = 1;
        do {
            if (i == 7) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}
