package lp4;

public class WrapperDemo {
    public static void main(String[] args) {
        // i is a object of Integer which points to the address of 100
        Integer i = 100;
        System.out.println("i = "+i);
        System.out.println(System.identityHashCode(i));
        int x = 20;
        i = x; //Autoboxing - conversion of data type from one to another
        System.out.println("i = "+i);
        System.out.println(System.identityHashCode(i));
        i = 99;
        x = i;

        System.out.println("x = "+x);
        // to get address of any java object
        System.out.println(System.identityHashCode(i));

        System.out.println((Integer.MAX_VALUE));
        System.out.println(Integer.MIN_VALUE);

        String s = "123"; //Java reads & writes everything as a String
        Integer d = Integer.parseInt(s);
        System.out.println("d = "+d);

        Long longNum = 12345678L;
        System.out.println("Here is the object's value: "+longNum);
        System.out.println(System.identityHashCode(longNum));
        long longNum2 = 123456789;
        System.out.println("Now here is the primitive type variable value: "+longNum2);

        Float floatNum = 123.4567f;
        System.out.println("Here is the float object's value: "+floatNum);
        System.out.println(System.identityHashCode(floatNum));
        float floatNum2 = 12.3456789f;
        System.out.println("Here is the primitive variable's value: "+floatNum2);

        Double dbNum = 2.2345;
        System.out.println("Here is the double object's value: "+dbNum);
        System.out.println(System.identityHashCode(dbNum));
        double dbNum2 = 4.5867;
        System.out.println("Here is the primitive double's value: "+dbNum2);

        String n=d+""; //Anything in Java can be converted to a String by appending +"" to it.
        System.out.println("n = "+n);


    }
    //byte short int long float double char boolean
    // Byte Short Integer Long Float Double Character Boolean

    //Try the same with long, float, and double
}
