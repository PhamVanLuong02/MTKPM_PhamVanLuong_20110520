package Visitor_Pattern;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<IComponent> components = new ArrayList<>();
        components.add(new ConcreteComponentA());
        components.add(new ConcreteComponentB());

        System.out.println("The client code works with all visitors via the base Visitor interface:");
        IVisitor visitor1 = new ConcreteVisitor1();
        Client.clientCode(components, visitor1);

        System.out.println();

        System.out.println("It allows the same client code to work with different types of visitors:");
        IVisitor visitor2 = new ConcreteVisitor2();
        Client.clientCode(components, visitor2);
    }
}

