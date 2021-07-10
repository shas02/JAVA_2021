package Practice_1;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cinderella that = (Cinderella) o;

        if (id != that.id) return false;
        if (size != that.size) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + (int) size;
        return result;
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
