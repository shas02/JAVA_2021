package Practice_2.Task_2;

public class Trumpet implements instrument {
    private int id;
    private double diameter;

    public Trumpet() {
    }

    public Trumpet(int id, double diameter) {
        this.id = id;
        this.diameter = diameter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println( "Играет труба c диаметром: " + diameter);
    }

    @Override
    public String toString() {
        return "Trumpet{" +
                "id=" + id +
                ", diameter=" + diameter +
                '}';
    }
}
