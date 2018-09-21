package Clases;

public class Lot {
    boolean a = false;

    public boolean ju(int x1, int y1, int x2, int y2) {
        System.out.println("Punto 1: " + x1 + " " + y1 + "Punto 2: " + x2 + " " + y2);
        if (x1 == x2) {
            if (y2 == (y1 + 2) | y2 == (y1 - 2)) {
                a = true;
                System.out.println(" A1" + a);
            } else {
                a = false;
                System.out.println(" A2" + a);
            }
        }

        if (y1 == y2) {
            if (x2 == (x1 + 1) | x2 == (x1 - 1)) {
                a = true;
                System.out.println(" B1" + a);
            } else {
                a = false;
                System.out.println(" B2" + a);
            }
        }
        System.out.println(a);
        return a;
    }
}
