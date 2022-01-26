package ai.alda.backoffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BackofficeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackofficeServiceApplication.class, args);
    }

}
