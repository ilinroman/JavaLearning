package Day14;

class Person {
    String name;
    int year;

    public Person(String[] str) {
        this.name = str[0];
        this.year = Integer.parseInt(str[1]);
    }

    public Person(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("{name='%s', age='%d'}", this.name, this.year);
    }
}
