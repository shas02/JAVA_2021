package Practice_5;

import java.time.LocalDate;
import java.util.Objects;

public class Computer {
    private String model;
    private LocalDate year;
    private int memory;
    private double price;
    private Harddrive harddrive;
    private Processor processor;

    public Computer() {
    }

    public Computer(String model, LocalDate year, int memory, double price, Harddrive harddrive, Processor processor) {
        this.model = model;
        this.year = year;
        this.memory = memory;
        this.price = price;
        this.harddrive = harddrive;
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

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Harddrive getHarddrive() {
        return harddrive;
    }

    public void setHarddrive(Harddrive harddrive) {
        this.harddrive = harddrive;
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
        return memory == computer.memory && Double.compare(computer.price, price) == 0 && Objects.equals(model, computer.model) && Objects.equals(year, computer.year) && Objects.equals(harddrive, computer.harddrive) && Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, memory, price, harddrive, processor);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", memory=" + memory +
                ", price=" + price +
                ", harddrive=" + harddrive +
                ", processor=" + processor +
                '}';
    }
}
