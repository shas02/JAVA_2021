package Practice_2.Task_2;

public class Main {
    public static void main(String[] args) {
        Guitar guitar1 = new Guitar(1, (byte) 3);
        Guitar guitar2 = new Guitar(2, (byte) 4);
        Guitar guitar3 = new Guitar(3, (byte) 5);
        Guitar guitar4 = new Guitar(4, (byte) 6);

        Drum drum1 = new Drum( 1, (byte) 3);
        Drum drum2 = new Drum( 2, (byte) 4);
        Drum drum3 = new Drum( 3, (byte) 5);

        Trumpet trumpet1 = new Trumpet(1,10);
        Trumpet trumpet2 = new Trumpet(2,15);
        Trumpet trumpet3 = new Trumpet(3,20);

        instrument[] Instruments = {guitar1, guitar2, guitar3, guitar4, drum1, drum2, drum3, trumpet1, trumpet2, trumpet3};

        for (instrument instrument : Instruments) {
            instrument.play();
        }

    }
}
