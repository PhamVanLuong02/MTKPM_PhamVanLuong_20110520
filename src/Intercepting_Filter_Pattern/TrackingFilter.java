package Intercepting_Filter_Pattern;

public class TrackingFilter implements Filter {

    @Override
    public void doFilter(HttpRequest request) {
        System.out.println("Tracking request: " + request);
    }
}
