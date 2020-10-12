import org.junit.Assert;

import java.util.LinkedList;
import java.util.List;

public class MainTest {
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void main() {
        Main m= new Main();
        int j=1;
        List<Weapon> l = new LinkedList<>();
        l = m.sortbydamage(l);
        for(int i= 0;j<l.size();i++){
            if(l.get(i).getDamage()>= l.get(j).getDamage()){

            }else{
                Assert.assertEquals(true,false);
            }
        }Assert.assertEquals(true,true);

    }
}
