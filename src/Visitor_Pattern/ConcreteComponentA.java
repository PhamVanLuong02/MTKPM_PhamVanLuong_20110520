package Visitor_Pattern;

public class ConcreteComponentA implements IComponent {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitConcreteComponentA(this);
    }

    public String exclusiveMethodOfConcreteComponentA() {
        return "A";
    }
}

