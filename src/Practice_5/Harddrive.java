package Practice_5;

import java.util.Objects;

public class Harddrive {
    private String model;
    private Types type;
    private double volume;
    private Countries producer;

    public Harddrive() {
    }

    public Harddrive(String model, Types type, double volume, Countries producer) {
        this.model = model;
        this.type = type;
        this.volume = volume;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Types getType() {
        return type;
    }

    public void setType(Types type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Countries getProducer() {
        return producer;
    }

    public void setProducer(Countries producer) {
        this.producer = producer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Harddrive harddrive = (Harddrive) o;
        return Double.compare(harddrive.volume, volume) == 0 && Objects.equals(model, harddrive.model) && type == harddrive.type && producer == harddrive.producer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, volume, producer);
    }

    @Override
    public String toString() {
        return "Harddrive{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", volume=" + volume +
                ", producer=" + producer +
                '}';
    }
}
