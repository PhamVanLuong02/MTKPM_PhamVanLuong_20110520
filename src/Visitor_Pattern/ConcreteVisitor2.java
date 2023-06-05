package Visitor_Pattern;

public class ConcreteVisitor2 implements IVisitor {
    @Override
    public void visitConcreteComponentA(ConcreteComponentA element) {
        System.out.println(element.exclusiveMethodOfConcreteComponentA() + " + ConcreteVisitor2");
    }

    @Override
    public void visitConcreteComponentB(ConcreteComponentB element) {
        System.out.println(element.specialMethodOfConcreteComponentB() + " + ConcreteVisitor2");
    }
}

