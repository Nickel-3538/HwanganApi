package com.nickel.nickelapiclientsdk;

import com.nickel.nickelapiclientsdk.client.NickelClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("nickel.client")
@Data
@ComponentScan
public class NickelApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public NickelClient nickelClient() {

        return new NickelClient(accessKey, secretKey);

    }

}
