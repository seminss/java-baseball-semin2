package baseball;

import baseball.view.InputView;
import baseball.view.OutView;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InputView inputView=new InputView();
        OutView outView=new OutView();
        playGame(inputView, outView);
    }

    private static void playGame(InputView inputView, OutView outView) {
        outView.printStart();
        Game game= new Game(inputView,outView);
        while(true){
            if (!game.runGame()) break;
        }
    }
}
