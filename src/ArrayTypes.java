public class ArrayTypes {
    public static void main(String[] args) {
        String[] strings = new String[2];

        strings[0] = "Ahmad";
        strings[1] = "Nugroho";

        System.out.println(strings[0]);
        System.out.println(strings[1]);

        int[] integers = new int[]{10, 90, 20, 40};
        integers[1] = 20;

        System.out.println(integers.length);

//        nested array
        String[][] members = {{"Ahmad"}, {"Dwi"}, {"Nugroho"}};

        System.out.println(members[1][0]);
    }
}
