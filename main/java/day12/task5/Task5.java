package Day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> membersA = new ArrayList<>();
        membersA.add(new MusicArtist("A M 1", 21));
        membersA.add(new MusicArtist("A M 2", 22));
        MusicBand a = new MusicBand("A", 2000, membersA);
        System.out.println(a);

        MusicBand b = new MusicBand("B");
        b.addMember("B M 1", 31);
        b.addMember("B M 2", 32);
        System.out.println(b);

        b.removeMember(new MusicArtist("B M 2", 32));
        System.out.println(b);

        MusicBand.transferMembers(a, b);

        a.printMembers();
        b.printMembers();
    }
}
