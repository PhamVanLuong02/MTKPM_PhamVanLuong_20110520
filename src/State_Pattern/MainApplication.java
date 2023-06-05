package State_Pattern;

public class MainApplication {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.request1();
        context.request2();
    }
}

