package br.com.wiremockstub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class WiremockstubApplication {

    public static void main(String[] args) {
        SpringApplication.run(WiremockstubApplication.class, args);
    }

    @Autowired
    Stubs stubs;

    @Autowired
    ResponseBodyMapper responseBodyMapper;

    @Autowired
    RequestBodyMapper requestBodyMapper;

    @PostConstruct
    public void startServerMock(){
        stubs.setUp()
                .stubForGetCustomer(responseBodyMapper.getCustomer200())
                .stubForAddCustomer(requestBodyMapper.getCustomer201(), responseBodyMapper.getCustomer());
    }

}
