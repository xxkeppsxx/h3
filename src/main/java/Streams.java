
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    int[] arr = new int[10000];

    public void arrayrandom(){
        for(int i = 0;i<this.arr.length;i++){
            arr[i] = (int)(Math.random()*100)+1;
        }
    }

    String leer = "";
    String s ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVW";
    String [] sarr = new String[10];

    public void stringarr(){
        for (int i = 0; i < sarr.length; i++) {

            for (int j = 0; j <10; j++) {
                leer += s.charAt((int) (Math.random()*s.length()));

            }
            sarr[i]=leer;
        }





    }

    public double average(int[] numbers) {
        return Arrays.stream(numbers).average().getAsDouble();

    }
    
    public List<String> upperCase(String[] strings) {

         return Arrays.stream(strings).map(s->s.toUpperCase()).collect(Collectors.toList());

    }
    
    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {
        return weapons.stream().min(Comparator.comparing(Weapon::getDamage)).orElse(null);
    }
    
    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        return weapons.stream().max(Comparator.comparing(Weapon::getDamage)).orElse(null);
    }
    
    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
      return weapons.stream().filter(w->w.getDamageType().equals(DamageType.MISSILE)).collect(Collectors.toList());
    }
    
    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        return weapons.stream().max((w1,w2) -> w1.getName().length() - w2.getName().length()).orElse(null);
    
    public List<String> toNameList(List<Weapon> weapons) {
g
    }
    
    public int[] toSpeedArray(List<Weapon> weapons) {
        weapons.stream().
    }
    
    public int sumUpValues(List<Weapon> weapons) {
    weapons.stream().reduce(Integer::sum);
    }
    
    public long sumUpHashCodes(List<Weapon> weapons) {
        weapons.stream().
    }
    
    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        //implement this
    }
    
    public void increaseValuesByTenPercent(List<Weapon> weapons) {
       //implement this
    }
}
