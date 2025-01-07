
/* Declare the Printer class, to print generic values */
class Printer {
    /* Declare a generic printArray method of type inputType,
     * accepting an array of type inputType */
    public <inputType> void printArray(inputType[] array) {
        /* Loop thru the array */
        for (int i = 0; i < array.length; i++) {
            /* Print out each element of the array on a new line */
            System.out.println(array[i]);
        }
    }
}

    /* Declare the solution class */
public class GenericHackerRank {

    /* Start the program here */
    public static void main(String[] args) {
        /* Create an instance of the Printer class */
        Printer myPrinter = new Printer();
        
        /* Create Integer and String arrays as test data */
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        
        /* Print the arrays using the generic function printArray */
        myPrinter.printArray( intArray );
        myPrinter.printArray( stringArray );
        
        
    }

}