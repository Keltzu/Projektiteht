import java.util.Random;

public class AgeDistribution {

    // Esikoodattu ikäjakauma: Ikä ja sen kumulatiivinen osuus
    static double[] ages = {18, 19, 20, 21, 22, 23};
    static double[] cumulativeProbs = {0.10, 0.35, 0.65, 0.85, 0.95, 1.00};

    public static void main(String[] args) {
        int numSamples = 1000; // Satunnaisten ikien määrä
        int[] ageDistribution = new int[ages.length];

        // Luo satunnaislukugeneraattori
        Random rand = new Random();

        // Arvotaan 1000 ikää
        for (int i = 0; i < numSamples; i++) {
            double r = rand.nextDouble(); // Satunnaisluku väliltä [0.0, 1.0)

            // Etsitään oikea ikä kumulatiivisesta jakaumasta
            for (int j = 0; j < cumulativeProbs.length; j++) {
                if (r < cumulativeProbs[j]) {
                    ageDistribution[j]++;
                    break;
                }
            }
        }

        // Tulostetaan ikäjakauma
        System.out.println("Ikäjakauma:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Ikä " + (int)ages[i] + ": " + ageDistribution[i] + " opiskelijaa");
        }

        // Tee useita testiajoja
        System.out.println("\nTestiajojen tulokset:");
        for (int i = 0; i < 5; i++) {
            testRun();
        }
    }

    // Testaa ohjelma satunnaisilla arvoilla
    public static void testRun() {
        int numSamples = 1000;
        int[] ageDistribution = new int[ages.length];
        Random rand = new Random();

        for (int i = 0; i < numSamples; i++) {
            double r = rand.nextDouble();

            for (int j = 0; j < cumulativeProbs.length; j++) {
                if (r < cumulativeProbs[j]) {
                    ageDistribution[j]++;
                    break;
                }
            }
        }

        // Tulostetaan ikäjakauma testiajojen jälkeen
        System.out.println("\nUusi testiajo:");
        for (int i = 0; i < ages.length; i++) {
            System.out.println("Ikä " + (int)ages[i] + ": " + ageDistribution[i] + " opiskelijaa");
        }
    }
}
