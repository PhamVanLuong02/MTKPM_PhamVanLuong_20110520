package Intercepting_Filter_Pattern;

import lombok.Data;

@Data
public class HttpRequest {

    private String clientIp;
    private String targetUrl;
}
