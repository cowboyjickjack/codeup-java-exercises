public class SyntaxLecture {

    public static void main(String[] args) {
     /* Declaring variables
     *  without initializing  */
        int weight;
        // Initialization after declaration
        weight = 12;
        // Declare and initialize at once
        String breed = "Toy Spaniel";
        String name = "Grinch";
        int cuteness = 10;
        // A statement:
        // "JVM, do something!"
//        System.out.println(name + " is a " + breed);

        // very small numbers: byte datatype
        byte smol = 12;
        System.out.println(smol);
        // declare a long: can hold very big numbers
        long bigNumber;
        // assign the small value to the large variable
        // "pour the small bucket into the large bucket"
        bigNumber = smol;
        System.out.println(bigNumber);
        // assign a big value to the big bucket
        bigNumber = 9000000000000L;
        // this won't work: assigning a big value to a smaller type
//        smol = bigNumber;
        // casting: converting one data type into another
        smol = (byte) bigNumber;
        System.out.println(smol);

        // float: 4 bytes of storage space
        float imafloat;
        // double: 8 bytes of storage space
        double imadouble = 9.0123456789012;
        // I can't fit a double inside a float
//        imafloat = imadouble;
        System.out.println(imadouble);
        imafloat = (float) imadouble;
        System.out.println(imafloat);
    }
}
