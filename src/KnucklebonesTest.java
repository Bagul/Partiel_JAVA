import org.junit.Test;
import org.junit.jupiter.api.Assertions;

class KnucklebonesTest {

    @Test
    void test1() {
        Knucklebones knucklebones = new Knucklebones();
        RandomGeneratorStub randomGeneratorStub = new RandomGeneratorStub();

        int result = knucklebones.roll(randomGeneratorStub);
        int expected = 0;
        Assertions.assertEquals(expected, result);
    }
}