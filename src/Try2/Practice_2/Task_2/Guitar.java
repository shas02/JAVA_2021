package Try2.Practice_2.Task_2;

public class Guitar implements Instrument{
    private int id;
    private byte number_of_strings;

    public Guitar() {
    }

    public Guitar(int id, byte number_of_strings) {
        this.id = id;
        this.number_of_strings = number_of_strings;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getNumber_of_strings() {
        return number_of_strings;
    }

    public void setNumber_of_strings(byte number_of_strings) {
        this.number_of_strings = number_of_strings;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с количеством струн: " + this.getNumber_of_strings());
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "id=" + id +
                ", number_of_strings=" + number_of_strings +
                '}';
    }
}
