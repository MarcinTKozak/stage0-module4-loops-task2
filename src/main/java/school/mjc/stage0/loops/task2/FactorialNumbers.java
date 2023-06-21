package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int nr = 1;
        long factNr = 1;

        while (nr <= printToInclusive) {
            factNr = factNr * nr;
            System.out.println(nr);
            nr++;

        }

    }
}
