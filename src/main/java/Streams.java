
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {

        ArrayList <Integer> list = new ArrayList<>();



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
        return weapons.stream().max((w1, w2) -> w1.getName().length() - w2.getName().length()).orElse(null);
    }
    public List<String> toNameList(List<Weapon> weapons) {
        return weapons.stream().map(weapon -> weapon.getName()).collect(Collectors.toList());
    }
    
    public int[] toSpeedArray(List<Weapon> weapons) {
       return weapons.stream().mapToInt(w1 -> w1.getSpeed()).toArray();
    }
    
    public int sumUpValues(List<Weapon> weapons) {
    return weapons.stream().mapToInt(value -> value.getValue()).sum();
    }
    
    public long sumUpHashCodes(List<Weapon> weapons) {
       return weapons.stream().mapToLong(hashcodes -> hashcodes.getValue()).sum();
    }
    
    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        return null;
    }
    
    public void increaseValuesByTenPercent(List<Weapon> weapons) {
        weapons.stream().forEach(v -> v.setValue((int) (v.getValue()*1.1)));
    }

    public void BeispielDrei(){
        final Predicate<Integer> isEven =e -> e % 2 == 0;
        final Predicate<Integer> isPositive = e-> e>0;
        final Predicate<Integer> isNull = Objects::isNull;
        final Predicate<Integer> is0 = e-> e==0;
        final Predicate<String> isShortWord = e-> e.length()<4;

        this.list.stream().filter(isEven.and(isPositive));
        this.list.stream().filter(isEven.negate().and(isPositive));

    }

    public void BeispielVier(){
        final int result = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ).filter(a->a %2 ==1).map(a -> a*a).sum();
        System.out.println(result);
    }
}
