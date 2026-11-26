public class Task16 {
    public static void main(String[] args) {
        int marks = 85;

        String grade = marks >= 90 ? "A grade" : marks >= 75 ? "B grade" : "C grade";

        System.out.println(grade);
    }
}