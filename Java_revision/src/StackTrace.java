public class StackTrace {

    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
        System.out.println(Thread.currentThread().getStackTrace()[1].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName());
        System.out.println(Thread.currentThread().getStackTrace()[2].getMethodName());
        method2();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        //System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
        method3();
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        //System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
        method5();

        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        //System.out.println(Thread.currentThread().getStackTrace()[1].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
