package baseball.view;

public enum ConstantView {

    START("숫자 야구 게임을 시작합니다."),
    INPUT("숫자를 입력해주세요 : "),

    END("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n + " +
            "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    public String getMessage() {
        return message;
    }

    ConstantView(String message) {
        this.message = message;
    }

    private String message;


}
