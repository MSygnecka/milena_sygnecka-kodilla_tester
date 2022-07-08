import java.util.Random;

public class RandomNumbers {

    int top = 5000;
    int max = 0;
    int min = 0;

    public int randomNumbers() {
        Random random = new Random();

        int sum = 0;
        while (sum < top) {
            int temp = random.nextInt(31);
            sum = sum + temp;

            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        }

        return 0;
    }
}
