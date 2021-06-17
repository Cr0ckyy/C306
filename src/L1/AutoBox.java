package L1;

import c306.GUIHelper;

public class AutoBox {

    public static void main(String[] args) {

        int a = 100;
        Integer one = a;    // auto convert int to Integer

        Character ch = 'x'; // auto convert char to Character

        Double h = 1.72;    // auto convert literal 1.72 to Double
        double height = h;  // auto convert Double to double

        Boolean found = true;
        if (found) {        // auto convert Boolean to boolean
            System.out.println("YES");
        }

        Double d1 = 1.2;
        double d2 = 3.5;
        Double d3 = d2;
        double d4 = d1;

        GUIHelper.output("Value of one is " + one);
        GUIHelper.output("Value of ch is " + ch);
        GUIHelper.output("Value of d3 is " + d3);
        GUIHelper.output("Value of d4 is " + d4);

    }

}
