import java.lang.reflect.Array;
import java.util.Arrays;

public class AverageSizeCalculator {
    public static void main(String[] args) {

        int value1 = 178;
        int value2 = 176;
        int value3 = 150;
        int value4 = 191;
        int value5 = 167;
        int value6 = 167;
        int value7 = 167;

        // besser int. Array !!

        // = new Int - weil wir noch keine Werte haben;
        int[] values1 = new int[5]; // values1_0, values 1_1, values1_2;
        values1[0] = 3;
        values1[1] = 4;
        values1[2] = 5;
        values1[3] = 6;
        values1[4] = 7;

        // gleich Werte zuteilen
        int[] values2 = {7, 5, 10, 5, 6};

        //values1.length kann ich auf Variablegröße zugreifen - gut :) - wenn ich oben new Int
        // Wert ändere - ändert er sich herunten auch :)

        for (int i = 0; i < values1.length; i++) {
            System.out.println("i = " + i + "; value: " + values1[i]);
        }

        for (int i = 0; i < values2.length; i++) {
            System.out.println("i = " + i + "; value: " + values2[i]);

        }

        System.out.println("Addition");
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            int result = values1[i] + values2[i];
            System.out.print(result);

            if (i < values1.length - 1) {
                System.out.print(",");
            }
        }
       // Zeilenumbuch System.out.println(); oder \n  siehe unten - nicht als eigene Zeile! direkt zu Text!
        System.out.println("\nMultiplizieren");
        for (int i = 0; i < values1.length && i < values2.length; i++) {
            int result = values1[i] * values2[i];

            // bei Einzeiligen if abfragen kann ich {}Klammern weg lassen
            if (i < values1.length - 1) {
                System.out.print( result + ",");}
                else System.out.println(result);


        }

        int sum = 0;
        for (int i = 0; i < values1.length; i++) {
            sum = sum + values1[i];
        }
        System.out.println("\nsum = " + sum);
        //soutv
       // weil mich die Summe nach jedem Zwischenschritt nicht (immer) interessiert - daher außerhalb der Schleife
        System.out.println("average = " + sum / (values1.length * 1.0));
        // durch *1,0 wird int zu double

        System.out.println(Arrays.toString(values1));
        System.out.println(Arrays.toString(values2));


    }
}
