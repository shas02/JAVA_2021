package Practice_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cinderella Anna = new Cinderella(1, "Anna", (byte) 36);
        Cinderella Polya = new Cinderella(2, "Polya", (byte) 37);
        Cinderella Vika = new Cinderella(3, "Vika", (byte) 38);
        Cinderella Zoya = new Cinderella(4, "Zoya", (byte) 39);
        Cinderella Olga = new Cinderella(5, "Olga", (byte) 40);
        Cinderella Masha = new Cinderella(6, "Masha", (byte) 41);
        Cinderella Olena = new Cinderella(7, "Olena", (byte) 42);
        Cinderella Hanna = new Cinderella(8, "Hanna", (byte) 43);
        Cinderella Nastya = new Cinderella(9, "Nastya", (byte) 44);
        Cinderella Karina = new Cinderella(10, "Karina", (byte) 45);

        System.out.println(Anna);

        Cinderella[] Cinderellas = {Anna, Polya, Vika, Zoya, Olga, Masha, Olena, Hanna, Nastya, Karina};
        System.out.println(Arrays.toString(Cinderellas));

        Prince Arthur = new Prince(1, "Arthur", (byte) 37);

        for (Cinderella cinderella : Cinderellas) {
            if (cinderella.getSize() == Arthur.getFoundedShoe()) {
                System.out.println(cinderella.getName() + " is Arthur's princess");
            }
        }

    }
}


