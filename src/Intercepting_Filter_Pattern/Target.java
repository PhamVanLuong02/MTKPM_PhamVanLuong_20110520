package Intercepting_Filter_Pattern;

public class Target {

    public void execute(HttpRequest request) {
        System.out.println("Executing request: " + request);
    }
}
