package indexpro;
import java.util.*;
public class GuessNumber {

	private static final int DIGIT_COUNT = 4; 
	private static String bestPlayer = "None";
	private static double bestScore = Double.MAX_VALUE;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		while (true) {
		System.out.println("Welcome to the Guessing Number Game");
		System.out.println("Press '1' to Start a New Game or '0' to Exit: ");
		int choice = scanner.nextInt();

		if (choice == 0) {
		System.out.println("Thank you for playing");
		break;
		}

		if (choice == 1) {
		System.out.print("Enter your name: ");
		String playerName = scanner.next();
		int[] computerNumber = generateUniqueNumber(random);

		System.out.println(" 4-digit number has been generated, Start guessing");

		int attempts = 0;
		long startTime = System.currentTimeMillis();
		boolean hasWon = false;

		while (!hasWon) {
		attempts++;
		System.out.print("Enter your 4-digit guess: ");
		String guess = scanner.next();

		if (!isValidGuess(guess)) {
		System.out.println("Invalid input! Please enter Correct 4 unique digits");
		continue;
		}

		int[] guessArray = convertToDigitArray(guess);
		String feedback = getFeedback(computerNumber, guessArray);

		if (feedback.equals("++++")) {
		hasWon = true;
		} else {
		System.out.println("Feedback: " + feedback);
		}
		}

		long endTime = System.currentTimeMillis();
		double timeTaken = (endTime - startTime) / 1000.0; 

		System.out.println("Congratulations, " + playerName + " You guessed the number  " + attempts + " moves and " + timeTaken + " seconds.");

		double currentScore = calculateScore(attempts, timeTaken);
		if (currentScore < bestScore) {
		bestScore = currentScore;
		bestPlayer = playerName;
		System.out.println("New Best Score: " + playerName + "!");
		} else {
		System.out.println("Current Best Score is  " + bestPlayer);
		}
		}
		}

		scanner.close();
		}

		private static int[] generateUniqueNumber(Random random) {
		Set<Integer> digits = new LinkedHashSet<>();
		while (digits.size() < DIGIT_COUNT) {
		digits.add(random.nextInt(10));
		}
		return digits.stream().mapToInt(i -> i).toArray();
		}

		private static boolean isValidGuess(String guess) {
		if (guess.length() != DIGIT_COUNT) return false;

		Set<Character> uniqueDigits = new HashSet<>();
		for (char c : guess.toCharArray()) {
		if (!Character.isDigit(c) || !uniqueDigits.add(c)) {
		return false;
		}
		}
		return true;
		}

	
		private static int[] convertToDigitArray(String guess) {
		int[] digits = new int[DIGIT_COUNT];
		for (int i = 0; i < DIGIT_COUNT; i++) {
		digits[i] = guess.charAt(i) - '0';
		}
		return digits;
		}

	
		private static String getFeedback(int[] computerNumber, int[] guessArray) {
		StringBuilder feedback = new StringBuilder();
		for (int i = 0; i < DIGIT_COUNT; i++) {
		if (guessArray[i] == computerNumber[i]) {
		feedback.append("+");
		} else if (contains(computerNumber, guessArray[i])) {
		feedback.append("-");
		}
		}
		return feedback.toString();
		}

		// Check if the array contains a specific value
		private static boolean contains(int[] array, int value) {
		for (int num : array) {
		if (num == value) return true;
		}
		return false;
		}

		// Calculate score based on time and attempts
		private static double calculateScore(int attempts, double timeTaken) {
		return timeTaken + (attempts * 2); // A weighted formula for scoring
		}
		

		
	}


