package Try2.Practice_2.Task_1;

public class Magazine implements Printable {

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
    public void print() {
        System.out.println("Magazine " + this.name + "is printed");
    }

    public static void printMagazines(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine){
                System.out.println(printable);
            }
        }
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
