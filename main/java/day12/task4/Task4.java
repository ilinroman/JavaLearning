package Day12.task4;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersA = new ArrayList<>();
        membersA.add("A M 1");
        membersA.add("A M 2");
        MusicBand a = new MusicBand("A", 2000, membersA);
        //MusicBand a = new MusicBand("A", 2000, Arrays.asList("A M 1", "A M 2")); //при очистке memebers исключение UnsupportedOperationException
        System.out.println(a);

        MusicBand b = new MusicBand("B");
        b.addMember("B M 1");
        b.addMember("B M 2");
        System.out.println(b);

        b.removeMember("B M 2");
        System.out.println(b);

        MusicBand.transferMembers(a, b);

        a.printMembers();
        b.printMembers();
    }
}
