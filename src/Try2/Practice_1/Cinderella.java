package Try2.Practice_1;

public class Cinderella {

    private int id;
    private String name;
    private byte size;

    public Cinderella() {
    }

    public Cinderella(int id, String name, byte size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getSize() {
        return size;
    }

    public void setSize(byte size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cinderella{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
