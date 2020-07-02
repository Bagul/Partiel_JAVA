import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGeneratorStub {

    private ArrayList<Integer> index;
    private Integer actualIndex;

    RandomGeneratorStub(){}

    public int run(List<Integer> list){
        if (this.index == null || this.index.size() != list.size()) {
            this.index = createArrayList(list);
            this.actualIndex = 0;
        }
        if (this.actualIndex > list.size()){
            this.actualIndex = 0;
        }
        Integer value = list.get(this.actualIndex);
        this.actualIndex += 1;
        return value;
    }

    private ArrayList<Integer> createArrayList(List<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i ++){
            newList.add(i);
        }
        return newList;
    }
}
