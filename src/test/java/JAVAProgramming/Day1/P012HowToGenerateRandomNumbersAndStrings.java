package JAVAProgramming.Day1;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class P012HowToGenerateRandomNumbersAndStrings {
    public static void main(String[] args) {
        // Approach 1 Random
//
//        Random rand = new Random();
//        int random_int = rand.nextInt(1000);
//        System.out.println(random_int);
//
//        double random_decimal = rand.nextDouble(); // range 0.0 and less than 1.0
//        System.out.println(random_decimal);

        // Approach 2 Math class
//        System.out.println(Math.random());

        // Approach 3 - Apache common - lang API
        String randNum = RandomStringUtils.randomNumeric(10);
        System.out.println(randNum);

        String randStr = RandomStringUtils.randomAlphabetic(20);
        System.out.println(randStr);

    }
}
