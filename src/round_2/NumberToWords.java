package round_2;
import java.util.*;
import java.util.Scanner;

import java.util.Scanner;

public class NumberToWords {
    // Arrays for number to word conversion
    private static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static final String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
    private static final String[] thousands = { "", "thousand", "million", "billion", "trillion" };  // Added "trillion"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number = sc.nextLong(); // For larger numbers, we use `long`
        
        System.out.println("In words: " + convertToWords(number));
    }

    // Function to convert a number into words
    public static String convertToWords(long number) {
        if (number == 0) {
            return "zero";
        }

        String result = "";
        int thousandGroupIndex = 0;

        while (number > 0) {
            // Get the last three digits of the number
            int chunk = (int) (number % 1000);
            
            // Convert this chunk to words if it's greater than zero
            if (chunk > 0) {
                String chunkInWords = convertThreeDigit(chunk);
                
                // Append the thousand group (thousand, million, billion, trillion, etc.)
                if (thousandGroupIndex > 0) {
                    chunkInWords += " " + thousands[thousandGroupIndex];
                }
                
                result = chunkInWords + " " + result;
            }
            
            // Move to the next thousand group
            number /= 1000;
            thousandGroupIndex++;
        }

        return result.trim();
    }

    // Helper function to convert a number up to three digits into words
    private static String convertThreeDigit(int number) {
        String result = "";

        // Handle hundreds place
        if (number / 100 > 0) {
            result += units[number / 100] + " hundred ";
            number %= 100;
        }

        // Handle the teen numbers (10–19) first
        if (number >= 10 && number < 20) {
            result += teens[number - 10] + " ";
            return result.trim(); // We return early for teen numbers to prevent extra processing
        }

        // Handle tens and units place
        if (number >= 20) {
            result += tens[number / 10] + " ";
            number %= 10;
        }

        // Handle units place
        result += units[number];

        return result.trim();
    }
}
