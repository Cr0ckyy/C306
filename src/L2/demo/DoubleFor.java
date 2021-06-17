package L2.demo;

public class DoubleFor {

    public static void main(String[] args) {
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int tmp = i * 10 + j;
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }

}
