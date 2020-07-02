import java.util.Arrays;
import java.util.List;

public class Coin {

    private List<Integer> faces;
    private List<Integer> faceValues;

    Coin(){
        this.faces = Arrays.asList(0,1);
        this.faceValues = Arrays.asList(0,1);
    }
}
