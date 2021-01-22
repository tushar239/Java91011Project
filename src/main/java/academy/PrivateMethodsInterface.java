package academy;

public interface PrivateMethodsInterface {
    //private void myPrivateMethod(); // not allowed. all interface methods are public by default
    // But private methods are allowed with body
    private void myPrivateMethod() {
        // Here, you can write a generic code that can be called from multiple 'public default' methods.
    }
    default void myPrivateDefaultMethod() {
        myPrivateMethod(); // you can call private method from public default method
    }
    //private default void myPrivateDefaultMethod() { }// not allowed. default methods are always public

    static void myPublicStaticMethod() {
        myPrivateStaticMethod(); // private static method can be used for generic code between multiple public static methods.
    }
    private static void myPrivateStaticMethod() { // static methods can be private also. Till Java 8, it could be public only.
        // Here, you can write a generic code that can be called from multiple 'public static' methods.
    }
}
