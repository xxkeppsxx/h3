import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Weapon> list = new LinkedList<>();
        Main m= new Main();

        list = Files.lines(new File("weapons.csv").toPath())
                .skip(1)
                .map(s -> s.split(";"))
                .map(s -> new Weapon(
                        s[0],
                        CombatType.valueOf(s[1]),
                        DamageType.valueOf(s[2]),
                        Integer.parseInt(s[3]),
                        Integer.parseInt(s[4]),
                        Integer.parseInt(s[5]),
                        Integer.parseInt(s[6])
                ))
                .collect(Collectors.toList());
        m.sortbydamage(list);


    }
    public void sortbydamage(List<Weapon> plist) {
        plist.sort((weapon1, weapon2) -> Integer.compare(weapon1.getDamage(), weapon2.getDamage()));
    }
    public void sortbyalphabet(List<Weapon> plist){

    }
}
