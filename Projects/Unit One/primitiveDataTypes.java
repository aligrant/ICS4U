public class primitiveDataTypes {
    public static void main(String[] args) {
        // byte small number
        byte minByte = -128;
        System.out.println(minByte);
        byte maxByte = 127;
        System.out.println(maxByte);
        short minShort = -32768;
        System.out.println(minShort);
        short maxShort = 32767;
        // integer mid number
        System.out.println(maxShort);
        int minInt = -2147483648;
        System.out.println(minInt);
        int maxInt = 2147483647;
        System.out.println(maxInt);
        long minLong = -9223372036854775808L;
        System.out.println(minLong);
        long maxLong = 9223372036854775807L;
        System.out.println(maxLong);
        // dont use floats (if you do then add an F at the end)
        float maxFloat = 3.14F;
        System.out.println(maxFloat);
        // Use doubles instead of floats because they hold more info
        double maxDouble = 3.141596384617846284617;
        System.out.println(maxDouble);
        // booleans cqn be true or false
        boolean booleanTrue = true;
        System.out.println(booleanTrue);
        boolean booleanFalse = false;
        System.out.println(booleanFalse);
        // characters "char" are basically just characters, use char codes or letter in
        // single quotes
        char character = 97;
        System.out.println(character);
        // CONVERSION OF PRIMITIVE DATA TYPES
        /**
         * Type casting is when you convert data types.
         * You can widen(make bigger)[byte-->double] or narrow(make
         * smaller)[double-->byte]
         */
        double d = 123.456789;
        int i = (int) d;
        System.out.println(i);

    }
}
