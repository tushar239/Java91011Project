public interface PrivateMethodsInterface {
    //private void myPrivateMethod(); // not allowed. all interface methods are public by default
    // But private methods are allowed with body
    private void myPrivateMethod() {

    }
    //private default void myPrivateDefaultMethod() { }// not allowed. default methods are always public

    private static void myPrivateStaticMethod() { // static methods can be private or public

    }
}
