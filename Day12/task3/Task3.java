package Day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> groupList = new ArrayList<>(10);
        groupList.add(new MusicBand("G1", 1990));
        groupList.add(new MusicBand("G2", 1990));
        groupList.add(new MusicBand("G3", 2000));
        groupList.add(new MusicBand("G4", 1995));
        groupList.add(new MusicBand("G5", 1999));
        groupList.add(new MusicBand("G6", 2000));
        groupList.add(new MusicBand("G7", 2001));
        groupList.add(new MusicBand("G8", 2000));
        groupList.add(new MusicBand("G9", 2002));
        groupList.add(new MusicBand("G10", 2000));
        Collections.shuffle(groupList);
        System.out.println(groupList);

        System.out.println(groupsAfter2000(groupList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> filteredBands = new ArrayList<>();
        for (MusicBand band: bands) {
            if (band.getYear() > 2000)
                filteredBands.add(band);
        }
        return filteredBands;
    }
}
