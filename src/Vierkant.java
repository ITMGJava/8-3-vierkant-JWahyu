public class Vierkant {
    public static void main(String[] args) {

        // Creëer een vierkant d.m.v. array, horizontale output and loop.
        // Series van loops.
        System.out.printf("%nHieronder tref je een vierkant bestaande uit nummers van 00 t/m 99 gemaakt d.m.v. for loops:%n%n");

        for (int nummers0 = 0; nummers0 < 10; nummers0++) {
            System.out.printf("%02d ", nummers0);
        }

        System.out.printf("%n");

        for (int nummers1 = 10; nummers1 < 20; nummers1++) {
            System.out.printf("%02d ", nummers1);
        }

        System.out.printf("%n");

        for (int nummers2 = 20; nummers2 < 30; nummers2++) {
            System.out.printf("%02d ", nummers2);
        }

        System.out.printf("%n");

        for (int nummers3 = 30; nummers3 < 40; nummers3++) {
            System.out.printf("%02d ", nummers3);
        }

        System.out.printf("%n");

        for (int nummers4 = 40; nummers4 < 50; nummers4++) {
            System.out.printf("%02d ", nummers4);
        }

        System.out.printf("%n");

        for (int nummers5 = 50; nummers5 < 60; nummers5++) {
            System.out.printf("%02d ", nummers5);
        }

        System.out.printf("%n");

        for (int nummers6 = 60; nummers6 < 70; nummers6++) {
            System.out.printf("%02d ", nummers6);
        }

        System.out.printf("%n");

        for (int nummers7 = 70; nummers7 < 80; nummers7++) {
            System.out.printf("%02d ", nummers7);
        }

        System.out.printf("%n");

        for (int nummers8 = 80; nummers8 < 90; nummers8++) {
            System.out.printf("%02d ", nummers8);
        }

        System.out.printf("%n");

        for (int nummers9 = 90; nummers9 < 100; nummers9++) {
            System.out.printf("%02d ", nummers9);
        }

        System.out.printf("%n%n―――――――――――――――――――――――――――%n");

        // Één korte loop.
        System.out.printf("%nHieronder tref je een vierkant bestaande uit nummers van 00 t/m 99 gemaakt d.m.v. één korte loop:%n%n");

        for (int nummersB = 0; nummersB < 100; nummersB++) {
            System.out.printf("%02d ", nummersB);
            if (((nummersB+1) % 10) == 0) {
                System.out.println();
            }
        }

        System.out.printf("%n―――――――――――――――――――――――――――%n");

        // Array.
        System.out.printf("%nHieronder tref je een vierkant bestaande uit nummers van 00 t/m 99 gemaakt d.m.v. een array:%n%n");

        int[] nummersArray = new int[100];

        for (int nummersC = 0; nummersC < nummersArray.length; nummersC++) {
            nummersArray[nummersC] = nummersC;
            System.out.printf("%02d ", nummersArray[nummersC]);
            if (((nummersC+1) % 10) == 0) {
                System.out.println();
            }
        }

        System.out.printf("%nDat was het dan. Dank en tot ziens!%n");
    }
}
