package br.com.wiremockstub;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResponseBodyMapper {

    @Getter
    @Setter
    @Value("classpath:__files/json/response/customer_200.json")
    private Resource customer200;

    @Getter
    @Setter
    @Value("classpath:__files/json/response/customer.json")
    private Resource customer;


}
