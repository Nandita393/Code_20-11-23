package code20;

public class Between100to999 {
	
	

    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 999 are:");
        for (int i = 100; i <= 999; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is an Armstrong number
    private static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}

