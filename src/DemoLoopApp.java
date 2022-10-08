public class DemoLoopApp {

    public static void main(String[] args) {
        System.out.println("DemoLoopApp");


//       mein Versuch:  --funktioniert :)))) - ist oke
       int zähle = 0;
        for (int zahl = 1; zahl <= 100_000; zahl++) {
      if ((zahl + zahl - 1) % 351 == 0) {         System.out.println("Die Summer der Zahlen ist durch 351 teilbar: " + zahl + "+" + (zahl - 1));
          zähle ++;
           if (zähle == 10){
               return;
          }
        }


//       andere Möglichkeit - Vortragender
//        int vorgaenger = 0;
//        int counter = 0;
//
//        for ( int i = 1; i < 100_000; i++) {
//            if ((i + vorgaenger) % 351 == 0) {
//            System.out.println("Der Vorgänger von " + i + " lautet " + vorgaenger);
//            counter ++;
//            if (counter == 10){
//                return;
//                //break
//            }
//            }
//
//            vorgaenger = i;
//

        }
    }
}
