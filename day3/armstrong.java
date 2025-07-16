package day3;
public class armstrong {
  
    public static void main(String[] args) {
        System.out.println("Armstrong numbers from 1 to 1000 are:");
        
        for (int number = 1; number <= 1000; number++) {
            int n = number;
            int sum = 0;
            int digits = String.valueOf(number).length();
            
            while (n > 0) {
                int digit = n % 10;
                sum += Math.pow(digit, digits);
                n /= 10;
            }

            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}

