package baseball;

import java.util.List;

public class OutView {
    public void printStart(){
        System.out.println("숫자 야구 게임을 시작합니다.");
    }
    public void gettingInput(){
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printResult(List<Integer> score){//[strike, ball]
        int strike=score.get(0);
        int ball=score.get(1);
//        System.out.println(score);
//        System.out.println(strike);
//        System.out.println(ball);
        if(strike==3){
            System.out.println("3스트라이크");
        }else if(strike>0 && ball==0){
            System.out.println(strike+"스트라이크");
        }else if(strike==0 && ball>0){
            System.out.println(ball+"볼");
        }else if (strike>0 &&ball>0) {
            System.out.println(ball+"볼 "+strike+"스트라이크");
        }else{//strike==0, ball==0
            System.out.println("낫싱");
        }
    }

    public void successMessage(){
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
