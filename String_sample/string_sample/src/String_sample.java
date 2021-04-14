public class String_sample {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        // the two string objects value belongs to the same pool
        System.out.println("s1 = "+System.identityHashCode(s1));
        System.out.println("s2 = "+System.identityHashCode(s2));

        //when a new string is instantiated with the same value it is outside the pool
        String s3 = new String("hello");
        System.out.println("s3 is outside of pool = "+System.identityHashCode(s3));

    }
}
