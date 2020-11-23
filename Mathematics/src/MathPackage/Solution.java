package MathPackage;

public class Solution implements Runnable{

        private String name;
        public Solution(String name)
        {
            this.name = name;
        }
        public void run()
        {
//            System.out.println("I’m " + this.name);
            for (int i = 0; i < 10; i++)
                System.out.println("111--- " + i);
        }


    public static void main(String[] args)
    {
        Solution printer = new Solution("Наташа");

//        for (int i = 0; i < 10; i++)
//            System.out.println("Ghbdtn " + i);

        Thread thread1 = new Thread(printer);
        thread1.start();

        for (int i = 0; i < 10; i++)
            System.out.println("222--- " + i);

        Thread thread2 = new Thread(printer);
        thread2.start();

        Thread thread3 = new Thread(printer);
        thread3.start();
    }}
