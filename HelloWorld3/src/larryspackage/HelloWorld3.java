package larryspackage;

import larryspackage2.App;

public class HelloWorld3 {
    public static void main(String[] args) {
        System.out.println("Alriiiight finally got this! What's up yall...");
        HelloWorld3.helloStatic();
        HelloWorld3 hw = new HelloWorld3();
        hw.thisIsNonStatic();
        App.isAnStaticApp();
        App firstObj = new App();
        firstObj.isAnNonStaticApp();
    }
    // method signature or method definition
    public static void helloStatic() {
        System.out.println("Hello from helloStatic()");
    }

    public void thisIsNonStatic() {
        System.out.println("Hi, this one is NON-static!");
    }
}
