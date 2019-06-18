package service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("common.models")
public class ServiceApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ServiceApplication.class, args);
    }

}
