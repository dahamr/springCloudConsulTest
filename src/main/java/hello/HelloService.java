package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RefreshScope
public class HelloService
{
    @Autowired
    private HelloConfig helloConfig;

    public String hello() {
        return helloConfig.getMessage();
    }
}
