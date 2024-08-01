
// Import statements
import java.io.IOException; // For handling input/output exceptions
import java.nio.file.Files; // For reading file contents into a byte array
import java.nio.file.Paths; // For obtaining file paths
import java.util.ArrayList; // For using ArrayList
import java.util.List; // For using List interface
import java.util.Scanner; // For reading user input

public class PlagiarismCheckerLCS {

    public static void main(String[] args) throws IOException {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        // Create a list to store file paths
        List<String> filePaths = new ArrayList<>();

        // Prompt the user to enter the number of files to compare
        System.out.println("Enter the number of files:");
        // Read the number of files
        int numberOfFiles = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Collect the file paths from the user
        for (int i = 0; i < numberOfFiles; i++) {
            System.out.println("Enter the path for file " + (i + 1) + ":");
            // Add each file path to the list
            filePaths.add(scanner.nextLine());
        }

        // Compare each pair of files
        for (int i = 0; i < numberOfFiles; i++) {
            for (int j = i + 1; j < numberOfFiles; j++) {
                // Read the content of the files into strings
                String document1 = new String(Files.readAllBytes(Paths.get(filePaths.get(i))));
                String document2 = new String(Files.readAllBytes(Paths.get(filePaths.get(j))));

                // Print the files being compared
                System.out.println("Comparing File " + (i + 1) + " with File " + (j + 1));

                // Calculate the length of the longest common subsequence (LCS)
                int lcsLength = longestCommonSubsequence(document1, document2);
                System.out.println("Length of Longest Common Subsequence: " + lcsLength);

                // Calculate the plagiarism score
                float plagiarismScore = calculatePlagiarismScore(document1.length(), document2.length(), lcsLength);
                System.out.println("Plagiarism Score: " + plagiarismScore + "%");
            }
        }

        // Close the scanner to free resources
        scanner.close();
    }

    // Function to calculate the length of the longest common subsequence (LCS)
    private static int longestCommonSubsequence(String s1, String s2) {
        // Create a 2D array to store LCS lengths of substrings
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        // Fill the dp table
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                // If characters match, increment the value from the diagonal cell
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    // Otherwise, take the maximum value from the cell above or to the left
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // The length of LCS is in the bottom-right cell of the table
        return dp[s1.length()][s2.length()];
    }

    // Function to calculate the plagiarism score based on the LCS length
    private static float calculatePlagiarismScore(int len1, int len2, int lcsLength) {
        // Determine the length of the longer document
        int maxLength = Math.max(len1, len2);
        // Calculate and return the plagiarism score as a percentage
        return ((float) lcsLength / maxLength) * 100;
    }
}
