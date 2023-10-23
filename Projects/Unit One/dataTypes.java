public class dataTypes {
    public static void main(String[] args) {
        int i = 90;
        String rightAngle = Integer.toString(i);
        System.out.println(rightAngle);
        // I just realised that it's print Ln instead of In D: this solves a lot of problems.
        String piRound = "3.14";
        double piRoundD = Double.parseDouble(piRound);
        System.out.println(piRoundD);
        piRoundD=(byte)piRoundD;
        //piRoundD is now 3.0, not 3.14 
        System.out.println(piRoundD);
        //the line below accurately divides 3.0(new value of piRoundD) by 2
        System.out.println((double)(piRoundD/2));
        //remainder when 80 is divided by 25
        System.out.println(90%25);

        //OTHER PRACTICE
        String S = "1";
        //byte b = 2;
        //short s = 3;
        int inte = 4;
        long l = 5L;
        //float f = 6F;
        double d = 7;

        //String to byte, short, int, long, float, double
        byte stringToByte;
        stringToByte = Byte.parseByte(S);
        System.out.println(stringToByte);
        short stringToShort;
        stringToShort = Short.parseShort(S);
        System.out.println(stringToShort);
        int stringToInt;
        stringToInt = Integer.parseInt(S);
        System.out.println(stringToInt);
        long stringToLong;
        stringToLong = Long.parseLong(S);
        System.out.println(stringToLong);
        float stringToFloat = Float.parseFloat(S);
        System.out.println(stringToFloat);
        double stringToDouble;
        stringToDouble = Double.parseDouble(S);
        System.out.println(stringToDouble);

        //Integer, long, short, and double to string
        String integerToString = Integer.toString(inte);
        System.out.println(integerToString);
        String longToString = Long.toString(l);
        System.out.println(longToString);
        String doubleToString = Double.toString(d);
        System.out.println(doubleToString);

        //Integer to Double (this is implicit in java)
        double integerToDouble = inte; 
        System.out.println(integerToDouble);


        //Integer to byte (this one actually needs typecasting)
        byte integerToByte = (byte)inte;
        System.out.println(integerToByte);

        //Double to integer
        int doubleToInteger = (int)d;
        System.out.println(doubleToInteger);

        //Double to long
        long doubleToLong = (long)d;
        System.out.println(doubleToLong);
    }
}
