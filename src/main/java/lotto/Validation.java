package lotto;

public class Validation {

    // 숫자만 입력했는지 검증
    public static void isDigit(String numbers) {
        for (char number : numbers.toCharArray()) {
            if (!Character.isDigit(number)) {
                throw new IllegalArgumentException("[ERROR] 숫자만 입력해 주세요.");
            }
        }
    }
    // 1000원 단위로 입력했는지 검증
    public static void isThousandUnit(long purchaseAmount) {
        if (purchaseAmount % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 1000원 단위로 입력해 주세요.");
        }
    }
    // 로또 구입 금액을 검증
    public static void validateLottoPurchaseAmount(String purchaseAmount) {
        isDigit(purchaseAmount);
        isThousandUnit(Long.parseLong(purchaseAmount));
    }

    // 1~45 사이의 숫자인지 검증
    public static void isRightLottoNumber(int number) {
        if (!(1 <= number && number <= 45)) {
            throw new IllegalArgumentException("[ERROR] 1000원 단위로 입력해 주세요.");
        }
    }

}



