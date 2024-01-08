import java.util.Arrays;
import java.util.Random;

public class LottoNumber {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int[] recommendedNumbers = generateLottoNumbers();
            Arrays.sort(recommendedNumbers);

            System.out.println("추천 로또 번호 " + i + ": " + Arrays.toString(recommendedNumbers));
        }
    }

    private static int[] generateLottoNumbers() {
        Random random = new Random();
        int[] recommendedNumbers = new int[6];

        for (int i = 0; i < 6; i++) {
            int randomNumber;
            do {
                randomNumber = random.nextInt(45) + 1;
            } while (contains(recommendedNumbers, i, randomNumber));

            recommendedNumbers[i] = randomNumber;
        }

        return recommendedNumbers;
    }

    private static boolean contains(int[] array, int index, int value) {
        for (int i = 0; i < index; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
