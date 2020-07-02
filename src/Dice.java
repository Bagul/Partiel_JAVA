import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Dice {

    private Integer facesNbr;
    private List<Integer> faces;


    Dice(List<Integer> faces){
        this.faces = faces;
        this.facesNbr = faces.size();

        if (faces.size() > 20){
            this.faces = faces.subList(0, 20);
        }
        if (faces.size() < 3){
            for (int i = faces.size(); i <= 4 - faces.size(); i++){
                this.faces.add(1);
            }
        }



    }

    public Integer roll(){
        RandomGenerator randomGenerator = new RandomGenerator();
        return randomGenerator.run(this.faces);
    }

    public Integer rollTest(){
        RandomGeneratorStub randomGenerator = new RandomGeneratorStub();
        return randomGenerator.run(this.faces);
    }

}
