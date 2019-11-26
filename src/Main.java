public class Main {
    public static void main(String[] args) {
        int[] sortedArray = new int[] {16, 23, 66, 69, 101, 107, 109, 126, 142, 183, 202, 230, 239, 283, 301, 314, 315, 320, 335, 374, 391, 414, 427, 460, 523, 530, 542, 581, 618, 626, 656, 669, 684, 720, 721, 744, 764, 771, 793, 796, 834, 882, 887, 915, 917, 919, 923, 928, 951, 979};

        int numberToLookFor = 126;
        int index = findIndexOfNumberInArray(numberToLookFor, sortedArray);

        if (sortedArray[index] == numberToLookFor) {
            System.out.println("Great! You are right!");
        } else {
            System.out.println("Sorry, try again!");
        }
    }

    /**
     * @param number Number to look for
     * @param array An array where search will be performed
     * @return An index of the array element with number
     */
    public static int findIndexOfNumberInArray(int number, int[] array) {

        // TODO: Place your code here

        return 0;
    }
}
