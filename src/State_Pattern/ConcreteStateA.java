package State_Pattern;

public class ConcreteStateA extends State {
    @Override
    public void handle1() {
        System.out.println("ConcreteStateA handles request1.");
        System.out.println("ConcreteStateA wants to change the state of the context.");
        this.context.transitionTo(new ConcreteStateB());
    }

    @Override
    public void handle2() {
        System.out.println("ConcreteStateA handles request2.");
    }
}
