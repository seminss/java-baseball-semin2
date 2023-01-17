package baseball.view;

import java.util.List;

public class OutView {
    public void printStart(){
        System.out.println(ConstantView.START.getMessage());
    }
    public void gettingInput(){
        System.out.print(ConstantView.INPUT.getMessage());
    }

    public void printResult(List<Integer> score){//[strike, ball]
        int strike=score.get(0);
        int ball=score.get(1);

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
        System.out.println(ConstantView.END.getMessage());
    }
}
