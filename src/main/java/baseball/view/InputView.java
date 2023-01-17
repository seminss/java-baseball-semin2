package baseball.view;
import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String inputUserNum() {
        String user_input= Console.readLine();

        if(user_input.length()!=3){ //입력이 3자리가 아니다
            throw new IllegalArgumentException("error");
        }
        isNum(user_input); //숫자인가(문자x)
        return user_input;
    }


    public boolean inputReplay(){
        String replay=Console.readLine();
        if(replay.equals("1")){
            return true;
        }
        if(replay.equals("2")){
            return false;
        }
        //1,2가 아니라면
        throw new IllegalArgumentException("error");
    }


    private void isNum(String user_input) {
        try {
            boolean contains = user_input.contains("0");
            if (contains){
                throw new IllegalArgumentException("error"); //숫자에 0이 포함되어 있으면 throw
            }
            int num = Integer.parseInt(user_input); //parseInt 로 숫자 변환이 안되면 throw ->catch
        }catch (Exception e){
            throw new IllegalArgumentException("error");
        }
    }
}
