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
        Main m = new Main();


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

        list.forEach(System.out::println);

        m.sortbydamage(list);

        m.sortbyalphabet(list);

        Printable printable = w ->{

            w.forEach(weap -> System.out.println(weap.toString()));
        };


    printable.print(list);


        System.out.printf("%-20s", " | " + "Name");
        System.out.printf("%-9s", " | " + "CombatType");
        System.out.printf("%-11s ", " | " + "DamageType");
        System.out.printf("%-6s", " | " + "Damage");
        System.out.printf("%-3s", " | " + "Speed");
        System.out.printf("%-6s", " | " + "Lenghth");
        System.out.printf("%-7s %n", " | " + "Value");
        System.out.println("+---------------------------------------------------------------------------------+");

        Printable tablePrint = (w) -> w.forEach(t ->{
            System.out.printf("%-20s", " | " + t.getName());
            System.out.printf("%-13s", " | " + t.getCombatType());
            System.out.printf("%-13s ", " | " + t.getDamageType());
            System.out.printf("%-9s", " | " + t.getDamage());
            System.out.printf("%-8s", " | " + t.getSpeed());
            System.out.printf("%-10s", " | " + t.getMinStrength());
            System.out.printf("%-7s %n", " | " + t.getValue());
            System.out.println("+---------------------------------------------------------------------------------+");
        });
        tablePrint.print(l);


    public List<Weapon> sortbydamage(List<Weapon> plist) {
       plist.sort((weapon1, weapon2) -> Integer.compare(weapon1.getDamage(), weapon2.getDamage()));
       return plist;
    }

    public List<Weapon> sortbyalphabet(List<Weapon> plist) {
        plist.sort((weapon1, weapon2) -> {
            int damageTypeCompare = weapon1.getDamageType().compareTo(weapon1.getDamageType());
            int compareCombatType = weapon1.getCombatType().compareTo(weapon2.getCombatType());
            if (compareCombatType == 0) {
                if (damageTypeCompare == 0) {
                    return weapon1.getName().compareTo(weapon2.getName());
                } else {
                    return damageTypeCompare;
                }
            } else {
                return compareCombatType;
            }
        });
    return plist;
    }

}
