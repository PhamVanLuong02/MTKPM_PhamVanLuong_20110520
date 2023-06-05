package Visitor_Pattern;

public interface IVisitor {
    void visitConcreteComponentA(ConcreteComponentA element);

    void visitConcreteComponentB(ConcreteComponentB element);
}
