package app.api.controller;

import org.apache.camel.model.rest.RestBindingMode;
import org.apache.camel.spring.SpringRouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SQLRoutes extends SpringRouteBuilder {


    @Override
    public void configure() throws Exception {

        restConfiguration()
                .component("servlet")
                .bindingMode(RestBindingMode.json);


    }
}
