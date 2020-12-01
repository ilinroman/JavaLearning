package Day12.task4;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
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

    @Override
    public String toString() {
        return String.format("Имя: %s Год: %d Участники: %s", this.name, this.year, this.members);
    }

    public List<String> getMembers() {
        return members;
    }

    public void addMember (String member) {
        this.members.add(member);
    }

    public boolean removeMember (String member) {
        for (String m: this.members)
            if (m.equals(member)) {
                this.members.remove(m);
                return true;
            }
        return false;
    }

    public void printMembers () {
        System.out.println("Участники команды " + this.name);
        for (String member: this.members) {
            System.out.println(member);
        }
    }

    public static void transferMembers(MusicBand bandFrom, MusicBand bandTo) {
        List<String> transMembers = bandFrom.getMembers();
        for (String transMember: transMembers) {
            bandTo.addMember(transMember);
        }
        bandFrom.getMembers().clear();
    }
}
