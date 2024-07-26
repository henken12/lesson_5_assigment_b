package Assigment_6;

public class Computer {   private String manufacturer;
    private String processor;
    private int ramSize;
    private double processorSpeed;


    public Computer(String manufacturer, String processor, int ramSize, double processorSpeed) {
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.processorSpeed = processorSpeed;
    }


    public int getRamSize() {
        return ramSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }


    public double computePower() {
        return ramSize * processorSpeed;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", processor='" + processor + '\'' +
                ", ramSize=" + ramSize +
                ", processorSpeed=" + processorSpeed +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Computer computer = (Computer) obj;

        if (ramSize != computer.ramSize) return false;
        if (Double.compare(computer.processorSpeed, processorSpeed) != 0) return false;
        if (!manufacturer.equals(computer.manufacturer)) return false;
        return processor.equals(computer.processor);
    }


    @Override
    public int hashCode() {
        int result;
        long temp;
        result = manufacturer.hashCode();
        result = 31 * result + processor.hashCode();
        result = 31 * result + ramSize;
        temp = Double.doubleToLongBits(processorSpeed);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

