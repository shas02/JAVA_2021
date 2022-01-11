package Try2.Practice_5;

import java.util.Objects;

public class HardDrive {
    private String model;
    private HardDriveType type;
    private double volume;
    private Countries country;

    public HardDrive() {
    }

    public HardDrive(String model, HardDriveType type, double volume, Countries country) {
        this.model = model;
        this.type = type;
        this.volume = volume;
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HardDriveType getType() {
        return type;
    }

    public void setType(HardDriveType type) {
        this.type = type;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HardDrive hardDrive = (HardDrive) o;
        return Double.compare(hardDrive.volume, volume) == 0 && Objects.equals(model, hardDrive.model) && type == hardDrive.type && country == hardDrive.country;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, volume, country);
    }

    @Override
    public String toString() {
        return "HardDrive{" +
                "model='" + model + '\'' +
                ", type=" + type +
                ", volume=" + volume +
                ", country=" + country +
                '}';
    }
}
