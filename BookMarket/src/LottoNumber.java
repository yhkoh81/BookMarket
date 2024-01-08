import java.util.Arrays;
import java.util.Random;

/**
 * LottoNumber 클래스는 로또 번호를 생성하고 출력하는 프로그램을 구현한 클래스입니다.
 */
public class LottoNumber {

    /**
     * 메인 메서드는 로또 번호를 5세트 생성하여 출력합니다.
     *
     * @param args 커맨드 라인 인수 (사용하지 않음)
     */
    public static void main(String[] args) {
        // 5번 반복하여 로또 번호 생성 및 출력
        for (int i = 1; i <= 5; i++) {
            // generateLottoNumbers 메서드를 사용하여 로또 번호 생성
            int[] recommendedNumbers = generateLottoNumbers();
            
            // 생성된 로또 번호를 오름차순으로 정렬
            Arrays.sort(recommendedNumbers);

            // 현재 세트의 추천 로또 번호 출력
            System.out.println("추천 로또 번호 " + i + ": " + Arrays.toString(recommendedNumbers));
        }
    }


    /**
     * 로또 번호를 생성하는 메서드입니다.
     *
     * @return 생성된 로또 번호를 담은 길이 6의 정수 배열을 반환합니다.
     */
    private static int[] generateLottoNumbers() {
        // 난수 생성을 위한 Random 객체 생성
        Random random = new Random();

        // 생성된 로또 번호를 저장할 배열 초기화
        int[] recommendedNumbers = new int[6];

        // 6개의 로또 번호를 생성
        for (int i = 0; i < 6; i++) {
            int randomNumber;

            // 중복된 번호가 생성되지 않도록 반복하여 난수 생성
            do {
                // 1에서 45 사이의 난수 생성
                randomNumber = random.nextInt(45) + 1;

            } while (contains(recommendedNumbers, i, randomNumber)); // 중복 검사

            // 생성된 난수를 배열에 저장
            recommendedNumbers[i] = randomNumber;
        }

        // 생성된 로또 번호 배열 반환
        return recommendedNumbers;
    }


    /**
     * 배열에 특정 값이 주어진 인덱스 이전에 포함되어 있는지 확인하는 메서드입니다.
     *
     * @param array 확인할 배열
     * @param index 확인할 값의 인덱스 범위 (인덱스 이전까지 검사합니다)
     * @param value 확인할 값
     * @return 주어진 인덱스 이전에 값이 포함되어 있으면 true, 그렇지 않으면 false를 반환합니다.
     */
    
    private static boolean contains(int[] array, int index, int value) {
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
