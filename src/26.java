public class RandomCodeGenerator {
    public static void main(String[] args) {
        // Example 1: Generate a list of numbers and sort them
        int[] numbers = {5, 3, 8, 2, 7};
        Arrays.sort(numbers);
        System.out.println("Sorted list: " + Arrays.toString(numbers));
        
        // Example 2: Convert an integer to a string with leading zeros
        String numStr = "101";
        int digitCount = (int) Math.ceil(Math.log(numStr.length() / 3.0)) - 1;
        System.out.println("String representation of " + numStr + " with leading zeros: " + String.format("%" + digitCount + "d", digitCount));
    }
}
