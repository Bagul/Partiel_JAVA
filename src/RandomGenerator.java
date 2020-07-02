import java.util.List;
import java.util.Random;

public class RandomGenerator {

    RandomGenerator(){}

    public int run(List<Integer> list){
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }
}
