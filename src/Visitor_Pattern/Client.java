package Visitor_Pattern;

import java.util.List;

public class Client {
    public static void clientCode(List<IComponent> components, IVisitor visitor) {
        for (IComponent component : components) {
            component.accept(visitor);
        }
    }
}
