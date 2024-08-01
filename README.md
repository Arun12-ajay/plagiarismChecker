Plagiarism Checker LCS

Overview

The Plagiarism Checker LCS is a simple Java application designed to compare multiple text files for similarities using the Longest Common Subsequence (LCS) algorithm. This tool reads the content of the specified files, computes the LCS between each pair, and provides a plagiarism score as a percentage. 

Features

- Accepts multiple file paths as input.
- Computes the Longest Common Subsequence (LCS) between each pair of files.
- Outputs the LCS length and a plagiarism score for each comparison.
- User-friendly console interface.

Prerequisites

- Java Development Kit (JDK) 8 or higher.

## How to Use

1.  Clone the Repository:

    ```sh
    git clone https://github.com/yourusername/plagiarism-checker-lcs.git
    cd plagiarism-checker-lcs
    ```

2.  Compile the Code:

    ```sh
    javac PlagiarismCheckerLCS.java
    ```

3. Run the Application:

    ```sh
    java PlagiarismCheckerLCS
    ```

4. Follow the On-Screen Prompts:
    - Enter the number of files you want to compare.
    - Provide the full paths to the files when prompted.

Example Usage

When you run the application, it will prompt you for the number of files and their respective paths. For example:

```
Enter the number of files:
3
Enter the path for file 1:
/path/to/file1.txt
Enter the path for file 2:
/path/to/file2.txt
Enter the path for file 3:
/path/to/file3.txt
```

The application will then compare each pair of files and output the results:

```
Comparing File 1 with File 2
Length of Longest Common Subsequence: 45
Plagiarism Score: 67.16%

Comparing File 1 with File 3
Length of Longest Common Subsequence: 30
Plagiarism Score: 40.00%

Comparing File 2 with File 3
Length of Longest Common Subsequence: 50
Plagiarism Score: 55.56%
```

Project Structure

```
plagiarism-checker-lcs/
│
├── PlagiarismCheckerLCS.java
├── README.md
└── LICENSE
```

Implementation Details

- PlagiarismCheckerLCS.java**: Main class that handles user input, reads file contents, and performs LCS computation and plagiarism score calculation.
- longestCommonSubsequence(String s1, String s2)**: Calculates the length of the LCS between two strings.
- calculatePlagiarismScore(int len1, int len2, int lcsLength)**: Computes the plagiarism score based on the LCS length.

License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

Contributing

Contributions are welcome! Please fork the repository and submit a pull request for any improvements or bug fixes.

Contact

For any questions or suggestions, please contact [your email](a7459057@gmail.com).

---

Thank you for using the Plagiarism Checker LCS! We hope it helps you identify similarities in your documents effectively.
