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
    DataMapper dataMapper;

    @PostConstruct
    public void startServerMock(){
        stubs.setUp().stubForGetCustomer(dataMapper.getCustomer200());
    }

}
