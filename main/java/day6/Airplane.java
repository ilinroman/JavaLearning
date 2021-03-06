package day6;

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

    public void info(){
        System.out.printf("Изготовитель: %s, год выпуска: %s, длина: %s, вес: %s, количество топлива в баке: %s",
            producer, year, length, weigt, fuel);
    }

    public void fillUp(int fuel){
        if(fuel > 0)
            this.fuel += fuel;
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
