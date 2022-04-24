package br.com.wiremockstub;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class DataMapper {

    @Getter
    @Setter
    @Value("classpath:__files/json/customer_200.json")
    private Resource customer200;


}
