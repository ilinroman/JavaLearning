package Day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weigt;
    private int fuel;

    public Airplane(String producer, int year, int length, int weigt) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weigt = weigt;
        this.fuel = 0;
    }

    public static void compareAirplanesfo(Airplane air1, Airplane air2){
        String compareResult = air1.length == air2.length ? "==" : air1.length > air2.length ? ">" : "<";
        System.out.printf("Длина самолета %s %s длина самолета %s",
            air1.producer,
            compareResult,
            air2.producer);
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeigt() {
        return weigt;
    }

    public int getFuel() {
        return fuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeigt(int weigt) {
        this.weigt = weigt;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
