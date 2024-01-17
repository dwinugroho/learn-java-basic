public class IfStatement {
    public static void main(String[] args) {
        short score = 80;
        short absence = 90;

        if (score >= 70 && absence >= 60) {
            System.out.println("Great!!");
        }

        String passed = score >= 70 && absence >= 60 ? "Great!!" : "Oh Noo";

        System.out.println(passed);
    }
}
