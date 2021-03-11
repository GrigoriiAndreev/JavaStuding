package MathPackage;
// Можно смело удалять
public class Stack {

    public static void main(String[] args) {

        StackTraceElement[] stackTraceElement = Thread.currentThread().getStackTrace();

        stackTraceElement[0].getClassName();
        stackTraceElement[0].getMethodName();

//        for(StackTraceElement elem : stackTraceElement) {
//            System.out.println("Класс = " + elem.getClassName());
//            System.out.println("Method = " + elem.getMethodName());
//
//        }
    }
}
