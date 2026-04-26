package blocksample.block;

/**
 * Hello world!
 *
 */
public class App 
{
    private static class InnerClass {
        public void callInnerFunc() {
            System.out.println("Call Inner Func.");
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Sample Calll!" );
        InnerClass inner = new InnerClass();
        inner.callInnerFunc();
        allCalls();
    }

    private static void allCalls() {
        callFunc();
        callFunc2();
        callFunc3();
        callFunc6();
        callFunc4();
    }

    private static void callFunc() {
        System.out.println("Call Func.");
    }

    private static void callFunc2() {
        System.out.println("Call Func2.");
    }

    private static void callFunc3() {
        System.out.println("Call Func3.");
    }

    private static void callFunc6() {
        System.out.println("Call Func6.");
    }

    private static void callFunc4() {
        System.out.println("Call Func4.");
    }
}
