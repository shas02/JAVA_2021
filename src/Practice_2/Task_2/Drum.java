package Practice_2.Task_2;

public class Drum implements instrument {
    private int id;
    private byte size;

    public Drum() {
    }

    public Drum(int id, byte size) {
        this.id = id;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "id=" + id +
                ", size=" + size +
                '}';
    }

    @Override
    public void play() {
        System.out.println( "Играет бараман c размером: " + size);
    }
}
