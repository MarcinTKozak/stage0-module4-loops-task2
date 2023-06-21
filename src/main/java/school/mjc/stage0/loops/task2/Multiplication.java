package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int nr = 0;

        while (nr <= multiplyByAndToInclusive) {
            System.out.println(nr * multiplyByAndToInclusive);
            nr++;
        }
    }
}
