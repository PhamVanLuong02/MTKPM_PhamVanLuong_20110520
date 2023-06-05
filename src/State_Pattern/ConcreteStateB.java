package State_Pattern;

public class ConcreteStateB extends State {
    @Override
    public void handle1() {
        System.out.println("ConcreteStateB handles request1.");
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteStateB handles request2.");
        System.out.println("ConcreteStateB wants to change the state of the context.");
        this.context.transitionTo(new ConcreteStateA());
    }
}

