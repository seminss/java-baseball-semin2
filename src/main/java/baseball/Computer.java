package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    List<Integer> random = new ArrayList<>();
    public List<Integer> makeRandom(){
        while (random.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!random.contains(randomNumber)) {
                random.add(randomNumber);
            }
        }
        return random;
    }
    public void clearRandom(){
        random.clear();
    }

}
