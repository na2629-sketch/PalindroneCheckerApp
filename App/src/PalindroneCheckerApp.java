//version 3.0
//author Abc
//useCase 3:Welcome page/UseCase
public class PalindroneCheckerApp {
    public static void main(String[] args){
        import java.util.Scanner;

        public class PalindromeCheckerApp {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Palindrome Checker Application - UC4 Character Array Method");
                System.out.print("Enter a string to check: ");
                String input = scanner.nextLine();
                scanner.close();

                boolean isPal = isPalindromeUsingCharArray(input);

                if (isPal) {
                    System.out.println("The string \"" + input + "\" IS a palindrome.");
                } else {
                    System.out.println("The string \"" + input + "\" IS NOT a palindrome.");
                }
            }

            /**
             * Checks if a given string is a palindrome using a character array and
             * the two-pointer technique. This method ignores case and non-alphanumeric characters.
             *
             * @param str The string to check.
             * @return true if the string is a palindrome, false otherwise.
             */
            public static boolean isPalindromeUsingCharArray(String str) {
                if (str == null) {
                    return false;
                }

                // Convert the string to a character array
                char[] charArray = str.toCharArray();

                // Initialize two pointers: one at the beginning, one at the end
                int left = 0;
                int right = charArray.length - 1;

                // Iterate while the left pointer is less than the right pointer
                while (left < right) {

                    // Move the left pointer inward if the character is not alphanumeric
                    // We use Character class methods to validate the characters
                    while (left < right && !Character.isLetterOrDigit(charArray[left])) {
                        left++;
                    }

                    // Move the right pointer inward if the character is not alphanumeric
                    while (left < right && !Character.isLetterOrDigit(charArray[right])) {
                        right--;
                    }

                    // Compare the characters, ignoring case
                    // If they are not equal, the string is not a palindrome
                    if (Character.toLowerCase(charArray[left]) != Character.toLowerCase(charArray[right])) {
                        return false;
                    }

                    // Move the pointers inward for the next comparison
                    left++;
                    right--;
                }

                // If the loop completes without returning false, it is a palindrome
                return true;
            }
        }


    }
}