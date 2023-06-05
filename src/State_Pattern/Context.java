package State_Pattern;

public class Context {
    private State state;

    public Context(State state) {
        this.transitionTo(state);
    }

    public void transitionTo(State state) {
        System.out.println("Context: Transition to " + state.getClass().getSimpleName() + ".");
        this.state = state;
        this.state.setContext(this);
    }

    public void request1() {
        this.state.handle1();
    }

    public void request2() {
        this.state.handle2();
    }
}
