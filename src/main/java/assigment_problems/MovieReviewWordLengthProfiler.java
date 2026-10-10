package assigment_problems;

public class MovieReviewWordLengthProfiler {
    public static void classifyWordLengths(String review) {
        int shortWords = 0;
        int mediumWords = 0;
        int longWords = 0;

        String[] words = review.trim().split("\\s+");

        for (String word : words) {
            if (word.isEmpty()) {
                continue;
            }

            int length = word.replaceAll("[^A-Za-z]", "").length();

            if (length >= 1 && length <= 4) {
                shortWords++;
            } else if (length >= 5 && length <= 8) {
                mediumWords++;
            } else if (length >= 9) {
                longWords++;
            }
        }

        System.out.println("Short: " + shortWords
                + " | Medium: " + mediumWords
                + " | Long: " + longWords);
    }

    public static void main(String[] args) {
        classifyWordLengths("This movie was absolutely fantastic and thrilling");
    }
}
