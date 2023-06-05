package Intercepting_Filter_Pattern;

public class Client {

    private FilterManager filterManager;

    public Client(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(HttpRequest request) {
        filterManager.filterRequest(request);
    }
}
