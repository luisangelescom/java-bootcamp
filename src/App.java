import Singleton.Singleton;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        singleton.setCounter();
        singleton.setCounter();
        singleton2.setCounter();
        System.err.println(singleton2.getCounter());
    }
}
