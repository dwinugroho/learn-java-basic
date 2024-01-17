public class SwitchStatement {
    public static void main(String[] args) {
        char score = 'A';

        switch (score) {
            case 'A':
                System.out.println("Great");
                break;
            case 'B':
            case 'C':
                System.out.println("Enough");
                break;
            default:
                System.out.println("Oh No!");
                break;
        }

        score = 'B';

        switch (score) {
            case 'A' -> System.out.println("Great");
            case 'B', 'C' -> System.out.println("Enough");
            default -> System.out.println("Oh No!");
        }

        score = 'C';

        String passed = switch (score) {
            case 'A':
                yield "Great";
            case 'B', 'C':
                yield "Enough";
            default:
                yield "Oh No!";
        };

        System.out.println(passed);
    }
}
