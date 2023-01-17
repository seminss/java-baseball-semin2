package baseball;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Integer> com_num;
    private List<Integer> user_num;
    private int ball;
    private int strike;

    public List<Integer> getCom_num() {
        return com_num;
    }

    public List<Integer> getUser_num() {
        return user_num;
    }

    public List<Integer> getScore(){ //[strike, ball]
        List<Integer> score=new ArrayList<>();
        score.add(strike);
        score.add(ball);
        return score;
    }
    public boolean isSuccess(){
        if(strike==3){
            return true;
        }
        return false;
    }
    public Game(List<Integer> user_num, List<Integer> com_num) {
        this.ball=0;
        this.strike=0;
        this.user_num = user_num;
        this.com_num = com_num;
    }

    public void decisionBallStrike(List<Integer>user, List<Integer>com_num){
        for(int i=0;i<3;i++){
            if(user.get(i)==com_num.get(i)){
                strike++;
                continue;
            }
            if(com_num.contains(user.get(i))){
                ball++;
            }

        }
    }

}