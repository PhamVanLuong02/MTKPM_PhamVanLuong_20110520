package Visitor_Pattern;

public class ConcreteVisitor1 implements IVisitor {
    @Override
    public void visitConcreteComponentA(ConcreteComponentA element) {
        System.out.println(element.exclusiveMethodOfConcreteComponentA() + " + ConcreteVisitor1");
    }

    @Override
    public void visitConcreteComponentB(ConcreteComponentB element) {
        System.out.println(element.specialMethodOfConcreteComponentB() + " + ConcreteVisitor1");
    }
}

