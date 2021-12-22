package Try2.Practice_1;

public class Prince {

    private int id;
    private String name;
    private byte foundedShoe;

    public Prince() {
    }

    public Prince(int id, String name, byte foundedShoe) {
        this.id = id;
        this.name = name;
        this.foundedShoe = foundedShoe;
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

    public byte getFoundedShoe() {
        return foundedShoe;
    }

    public void setFoundedShoe(byte foundedShoe) {
        this.foundedShoe = foundedShoe;
    }

    @Override
    public String toString() {
        return "Prince{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foundedShoe=" + foundedShoe +
                '}';
    }
}
