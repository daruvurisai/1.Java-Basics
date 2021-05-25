public class ByteShortIntLong {
    public static void main(String[] args){
        //Int
        //Used wrapper class to perform operations on integer which are MIN_VALUE and MAX_VALUE
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        //We can use underscore for long integer numbers.
        //int c = 2_145_483__647;
        //System.out.println(c);
        System.out.println("Minimum value of Int :" +a);
        System.out.println("Maximum Value of Int :" +b);


        //Byte
        //Byte Wrapper class
        byte b1= Byte.MIN_VALUE;
        byte b2= Byte.MAX_VALUE;
        System.out.println("Maximum Value of Byte :" +b1);
        System.out.println("Maximum Value of Byte :" +b2);

        //Short
        //Short is a wrapper class
        short s1 =Short.MIN_VALUE;
        short s2 = Short.MAX_VALUE;
        System.out.println("Maximum Value of Short :" +s1);
        System.out.println("Maximum Value of Short :" +s2);

        //Long
        //Long is a wrapper class

        long l1=Long.MIN_VALUE;
        long l2=Long.MAX_VALUE;
        System.out.println("Maximum Value of Long :" +l1);
        System.out.println("Maximum Value of Long :" +l2);

        //Declaration of long
        long value = 1000000000L;
        System.out.println("Long value declaration 100000l = " +value);


    }
}
