public class Main {
    public static void main(String[] args) {
        int number = 19;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if(number%i == 0){
                isPrime = false;
            }
        }
        if(isPrime) {
            System.out.println("Number is prime.");
        }else{
            System.out.println("Number is not prime.");
        }
    }
}