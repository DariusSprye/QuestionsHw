public class homeWork {

    //Question 1
        public static int getLastIndex(String[] names) {
            return names.length -1;
        }
//        Question 2
        public static int getSecondToLastIndex(String[] names) {
            return names.length -2;
        }
//        Question 3
        public static String getFirstElement(String[] names) {
            return names[0];
        }
//        Question 4
        public static String getLastElement(String[] names) {
            return names[3];
        }
//        Question 5
        public static String getSecondToLastElement(String[] names) {
            return names[2];
        }
////        Question 6
        public static int getSum(int[] ints) {
            return 0;
        }
////        Question 7
//        public static int getAverage(int[] ints) {
//            return 0;
//        }
////        Question 8
//        public static int extractAllOddNumbers(int[] numbers) {
//            return null;
//        }
////        Question 9
//        public static int extractAllEvenNumbers(int[] numbers) {
//            return null;
//        }
////        Question 10
//        public static boolean contains(String[] names, String element) {
//            return false;
//        }
////        Question 11
//        public static int getIndexByElement(String[] names, String element) {
//            return 0;
//        }
////        Question 12
//        public static void printOddNumbersInRange(int start, int end){
//
//        }
////        Question 13
//        public static String printGivenStringTimesNumberGiven(String str, int n) {
//            return null;
//        }
////        Question 14
//        public static String repeatFirstThreeLetters(String str, int n) {
//            return null;
//        }
////        Question 15
////// Write a java method to count all the words in a string
//        public static int WordsInAStringCounter(String str){
//            return null;
//        }
public static void main(String[] args) {

            String [] names = {"Darius", "Bod", "Darren", "Raul"};
    System.out.println(getLastIndex(names));
    System.out.println(getSecondToLastIndex(names));
    System.out.println(getFirstElement(names));
    System.out.println(getLastElement(names));
    System.out.println(getSecondToLastElement(names));
    System.out.println();

    }

}
