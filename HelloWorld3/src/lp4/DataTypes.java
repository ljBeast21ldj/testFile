package lp4;

public class DataTypes {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(x);
        System.out.println("x = "+x);

        float f = 12.33f;
        System.out.println("f = "+f);
        double d =122.33;
        System.out.println("d = "+d);


        long l = 12345678999L;
        System.out.println("l = "+l);

        char c = 'A';
        System.out.println("c = "+c);

    }

    /*
    Data Type - Its a type of memory
    you are asking for the operating system
    to allocate it for you.
    Java has 8 primitive types and 8 wrappers as well.
    It wraps up the property of primitive data type to make
    it as an object.


    DataType          Size          Default Value
    ______________________________________________
    byte               1byte               0
    short              2bytes              0
    int                4bytes              0
    long               8bytes              0
    float              4bytes              0.0000f
    double             8bytes              0.0000d (Java reads all decimal values by default as double)
    char               2bytes              '/u0000' (Java supports unicode characterset)
    boolean            1bit                false








    */
}
