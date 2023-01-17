package baseball;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView=new InputView();
        OutView outView=new OutView();
        Computer computer=new Computer();//랜덤 값 세팅
        outView.printStart();
        while(true){
            if (!runGame(inputView, outView, computer)) break;
        }
    }

    private static boolean runGame(InputView inputView, OutView outView, Computer computer) {
        computer.makeRandom();
        while (true) {
            outView.gettingInput();

            String userInput = inputView.inputUserNum();//user input 값 입력
            List<Integer> userNum = convertStringToInteger(userInput);//input Integer List 변환

            System.out.println(userNum);
            System.out.println(computer.random);

            Game game = new Game(userNum, computer.random);
            game.decisionBallStrike(game.getUser_num(), game.getCom_num());
            outView.printResult(game.getScore());

            if (game.isSuccess()) {
                outView.successMessage();
                if (inputView.inputReplay() == false) {
                    break;
                }
                computer.clearRandom();
                computer.makeRandom();
            }
        }
        return false;
    }

    public static List<Integer> convertStringToInteger(String s){
        List<Integer> userNum=new ArrayList<>();
        for(int i=0;i<3;i++){
            userNum.add(Character.getNumericValue(s.charAt(i)));
        }
        return userNum;
    }
}
