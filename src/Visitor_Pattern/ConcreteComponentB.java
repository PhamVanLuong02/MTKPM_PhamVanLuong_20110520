package Visitor_Pattern;

public class ConcreteComponentB implements IComponent {
    @Override
    public void accept(IVisitor visitor) {
        visitor.visitConcreteComponentB(this);
    }

    public String specialMethodOfConcreteComponentB() {
        return "B";
    }
}

