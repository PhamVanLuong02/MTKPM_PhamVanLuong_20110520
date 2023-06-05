package Intercepting_Filter_Pattern;

public class AuthenticationFilter implements Filter {

    @Override
    public void doFilter(HttpRequest request) {
        System.out.println("Authenticating request: " + request);
    }
}
