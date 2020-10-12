
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    int[] arr = new int[10000];

    public void arrayrandom(){
        for(int i = 0;i<this.arr.length;i++){
            arr[i] = (int)(Math.random()*100)+1;
        }
    }




    public double average(int[] numbers) {
        Arrays.stream(numbers).average();

    }
    
    public List<String> upperCase(String[] strings) {
        List <String> list = new ArrayList<>();
         //Arrays.stream(strings).forEach(String::toUpperCase);
       list.add( Arrays.stream(strings).toString().toUpperCase());
         return list;
    }
    
    public Weapon findWeaponWithLowestDamage(List<Weapon> weapons) {

    }
    
    public Weapon findWeaponWithHighestStrength(List<Weapon> weapons) {
        //implement this
    }
    
    public List<Weapon> collectMissileWeapons(List<Weapon> weapons) {
        List <Weapon> list = new ArrayList<>();
        list.add((Weapon) weapons.stream().filter(DamageType.MISSILE));
    }
    
    public Weapon findWeaponWithLongestName(List<Weapon> weapons) {
        //implement this
    }
    
    public List<String> toNameList(List<Weapon> weapons) {
        List <String> list = new ArrayList<>();

       list.add(weapons.stream().toString());
    }
    
    public int[] toSpeedArray(List<Weapon> weapons) {
        weapons.stream().;
    }
    
    public int sumUpValues(List<Weapon> weapons) {
    weapons.stream().
    }
    
    public long sumUpHashCodes(List<Weapon> weapons) {
        weapons.stream()
    }
    
    public List<Weapon> removeDuplicates(List<Weapon> weapons) {
        //implement this
    }
    
    public void increaseValuesByTenPercent(List<Weapon> weapons) {
       //implement this
    }
}
