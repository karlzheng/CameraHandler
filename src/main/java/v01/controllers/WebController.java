package v01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import v01.AppInitializer;

import java.io.IOException;

@Controller
public class WebController {

    @Autowired
    private RestTemplate restTemplate;

    public WebController() throws IOException {
        AppInitializer.init();
    }

    @RequestMapping(value = "/")
    public String homePage() {
        return "home";
    }
}
