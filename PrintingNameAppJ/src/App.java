import java.util.Random;

public class App {
    public static void main(String[] args) {

        String name = args[0];

        printExercise(name);
    }

    public static void printExercise(String name){
        Random random = new Random();
        if (name == null) {
            System.out.println("Please set the NAME environment variable.");
            return;
        }


        for (int i = 1; i <= 15; i++) {
            int randomNumber = random.nextInt(5) + 1; // Generate a random number between 1 (inclusive) and 6 (exclusive)
            System.out.println("Hello, I am " + name + " and I am printing the number " + i);
            try {
                Thread.sleep(randomNumber * 1000); // Sleep for a random time between 1 and 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
