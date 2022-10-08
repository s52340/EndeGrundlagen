public class DemoApp {

    public static void main(String[] args) {

        boolean shouldRun = true;
        int counter = 0;

        // == true kann man weg lassen; endlos Schleife
        while (shouldRun == true) {
            System.out.println("Die Schleife läuft");
            counter ++;

            if (counter > 100_000) {
                // shouldRun = false;
               // break;
               // return;
                continue;
            }
            System.out.println("after break");
        }
        System.out.println("after Loop");


    }
}
