package Try2.Practice_5;

import java.time.LocalDate;
import java.util.Objects;

public class Computer {
    private String model;
    private LocalDate year;
    private double memory;
    private double price;
    private HardDrive hardDrive;
    private Processor processor;

    public Computer() {
    }

    public Computer(String model, LocalDate year, double memory, double price, HardDrive hardDrive, Processor processor) {
        this.model = model;
        this.year = year;
        this.memory = memory;
        this.price = price;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Double.compare(computer.memory, memory) == 0 && Double.compare(computer.price, price) == 0 && Objects.equals(model, computer.model) && Objects.equals(year, computer.year) && Objects.equals(hardDrive, computer.hardDrive) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, memory, price, hardDrive, processor);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                ", price=" + price +
                ", hardDrive=" + hardDrive +
                ", processor=" + processor +
                '}';
    }
}
