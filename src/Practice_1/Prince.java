package Practice_1;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Prince prince = (Prince) o;

        if (id != prince.id) return false;
        if (foundedShoe != prince.foundedShoe) return false;
        return name.equals(prince.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) foundedShoe;
        return result;
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
