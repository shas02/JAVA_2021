package Practice_2.Task_1;

public class Magazine implements Printable{

    private int id;
    private String name;

    public Magazine() {
    }

    public Magazine(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        if (id != magazine.id) return false;
        return name.equals(magazine.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    static void printMagazines(Printable[] printable) {
        for (Printable printable1 : printable) {
            if (printable1 instanceof Magazine) {
                System.out.println(printable1);
            }
        }
    }

    @Override
    public void print() {
        System.out.println("The magazine '" + getName() + "' was printed.");
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
