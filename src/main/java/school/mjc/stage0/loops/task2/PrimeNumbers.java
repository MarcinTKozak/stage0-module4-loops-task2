package school.mjc.stage0.loops.task2;

public class PrimeNumbers {


    public void printPrimeNumbers(int printToInclusive) {

        int primeCheckNumber;
        int n = 1;
        int counter;

        while (n <= printToInclusive) {
            primeCheckNumber = 2;
            counter = 0;
            while (primeCheckNumber <= n / 2) {
                if (n % primeCheckNumber == 0) {
                    counter++;
                    break;
                }
                primeCheckNumber++;
            }
            if (counter == 0 && n != 1) {
                System.out.println(n + " ");
            }
            n++;
        }
    }
}
