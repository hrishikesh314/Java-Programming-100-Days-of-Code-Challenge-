public class PairsInAnArray {
    public static void PairArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 4, 5, 6, 7};
        PairArray(numbers);
    }
}
