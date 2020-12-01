package Day12.task5;

class MusicArtist {
    private String name;
    private int age;

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s (возраст: %d)", this.name, this.age);
    }


    /*
     * ВАЖНО! Для корректного сравнения объектов класса MusicArtist
     * необходимо переопределить методы equals и hashCode
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        MusicArtist obj2 = (MusicArtist) obj;
        return (this.name.equals(obj2.name) && this.age == obj2.age);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + this.age;
        return result;
    }
}
