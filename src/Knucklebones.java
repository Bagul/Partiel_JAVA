import java.util.Arrays;
import java.util.List;

public class Knucklebones {

    private List<Integer> faces;
    private List<Integer> faceValues;

    Knucklebones(){
        this.faces = Arrays.asList(0,1,2,3);
        this.faceValues = Arrays.asList(1,3,4,6);
    }

    public int roll(RandomGenerator randomGenerator){
        return randomGenerator.run(this.faces);
    }

    public int roll(RandomGeneratorStub randomGenerator){
        return randomGenerator.run(this.faces);
    }
}
