import java.util.function.Predicate;

public enum DamageType implements Predicate<Weapon> {
    SLASHING, PIERCING, BLUNT, MISSILE, NONE;

    @Override
    public boolean test(Weapon weapon) {
        return false;
    }
}
