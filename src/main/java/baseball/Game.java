package baseball;

import baseball.view.InputView;
import baseball.view.OutView;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Integer> com_num;
    private int ball;
    private int strike;
    private OutView outView;
    private InputView inputView;

    public Game(InputView inputView, OutView outView) {
        this.inputView = inputView;
        this.outView = outView;
    }
    public boolean runGame(){
        Computer computer = new Computer();
        com_num=computer.makeRandom();
        while (true) {
            initScore();
            outView.gettingInput();
            List<Integer> userNum = settingUserNumber();
            decisionBallStrike(userNum, com_num);
            outView.printResult(getScore());
            if (isExit(computer)) return false;
        }
    }

    private List<Integer> settingUserNumber() {
        String userInput = inputView.inputUserNum();//user input 값 입력
        List<Integer> userNum = convertStringToInteger(userInput);//input Integer List 변환
        return userNum;
    }

    private List<Integer> getScore(){ //[strike, ball]
        List<Integer> score=new ArrayList<>();
        score.add(strike);
        score.add(ball);
        return score;
    }

    private boolean isSuccess(){
        if(strike==3){
            return true;
        }
        return false;
    }

    private void decisionBallStrike(List<Integer>user, List<Integer>com_num){
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

    private boolean isExit(Computer computer) {
        if (isSuccess()) {
            outView.successMessage();
            if (inputView.inputReplay() == false) {
                return true;
            }
            computer.clearRandom();
            computer.makeRandom();
        }
        return false;
    }

    private void initScore() {
        this.ball=0;
        this.strike=0;
    }


    private List<Integer> convertStringToInteger(String s){
        List<Integer> userNum=new ArrayList<>();
        for(int i=0;i<3;i++){
            userNum.add(Character.getNumericValue(s.charAt(i)));
        }
        return userNum;
    }

}