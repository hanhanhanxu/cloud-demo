package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumerAplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerAplication.class);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
