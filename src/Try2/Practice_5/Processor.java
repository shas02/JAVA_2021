package Try2.Practice_5;

import java.util.Objects;

public class Processor {
    private String type;
    private int numberOfCores;
    private double frequency;
    private Countries producer;

    public Processor() {
    }

    public Processor(String type, int numberOfCores, double frequency, Countries producer) {
        this.type = type;
        this.numberOfCores = numberOfCores;
        this.frequency = frequency;
        this.producer = producer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
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
        Processor processor = (Processor) o;
        return numberOfCores == processor.numberOfCores && Double.compare(processor.frequency, frequency) == 0 && Objects.equals(type, processor.type) && producer == processor.producer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, numberOfCores, frequency, producer);
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type='" + type + '\'' +
                ", numberOfCores=" + numberOfCores +
                ", frequency=" + frequency +
                ", producer=" + producer +
                '}';
    }
}
