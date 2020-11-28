package Day12.task5;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public MusicBand(String name) {
        this.name = name;
        this.year = Year.now().getValue();
        this.members = new ArrayList<>();
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

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s Год: %d Участники: %s", this.name, this.year, this.members);
    }

    public void addMember (MusicArtist member) {
        this.members.add(member);
    }

    public void addMember (String name, int age) {
        this.members.add(new MusicArtist(name, age));
    }

    public boolean removeMember (MusicArtist member) {
        for (MusicArtist m: this.members)
            if (m.equals(member)) {
                this.members.remove(m);
                return true;
            }
        return false;
    }

    public void printMembers () {
        System.out.println("Участники команды " + this.name);
        for (MusicArtist member: this.members) {
            System.out.println(member);
        }
    }

    public static void transferMembers(MusicBand bandFrom, MusicBand bandTo) {
        for (MusicArtist transMember: bandFrom.getMembers()) {
            bandTo.addMember(transMember);
        }
        bandFrom.getMembers().clear();
    }
}
