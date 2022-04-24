package br.com.wiremockstub;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class RequestBodyMapper {

    @Getter
    @Setter
    @Value("classpath:__files/json/request/customer_201.json")
    private Resource customer201;

}
