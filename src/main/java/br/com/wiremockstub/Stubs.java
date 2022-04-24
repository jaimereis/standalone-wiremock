package br.com.wiremockstub;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.client.WireMock;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

@Component
public class Stubs {

    public WireMockServer wireMockServer;

    public Stubs setUp() {
        wireMockServer = new WireMockServer(3467);
        wireMockServer.start();
        return this;
    }

    public Stubs stubForGetCustomer(Resource body) {
        wireMockServer.
                stubFor(WireMock
                        .get(String.format("/v1/customers"))
                        .willReturn(WireMock.aResponse().
                                withStatus(200).
                                withHeader("Content-Type", "application/json")
                                .withBody(ResourceUtils.getContentFile(body))));
        return this;
    }

}
