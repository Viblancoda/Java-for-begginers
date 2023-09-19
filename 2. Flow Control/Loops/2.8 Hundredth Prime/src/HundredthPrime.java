public class HundredthPrime
{
   public static void main(String[] args)
   {
      int count = 0; // Count of prime numbers
      int number = 2; // Start with the first prime number

      while (true) {
         boolean isPrime = true; // Assume the number is prime
         for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
               isPrime = false; // Found a factor, so it's not prime
               break;
            }
         }
         if (isPrime) {
            count++;
            if (count == 100) {
               System.out.println(number);
               break; // Exit the loop when the hundredth prime is found
            }
         }
         number++;
      }
   }
}
