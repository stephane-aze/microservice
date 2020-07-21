package fr.esgi.jal4.si.ms.assessment.controller;

import com.netflix.discovery.EurekaClient;
import fr.esgi.jal4.si.ms.assessment.dto.PostDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class APIController {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;
    @Value("${spring.application.name}")
    private String appName;
    @PostMapping("api/text/concat")
    public String post(@Valid @RequestBody PostDTO post) {
        //if(post.str1.isEmpty())
        return post.str1 + post.str2;
    }
    @GetMapping("api/text/last_length")
    public Integer getLength(){
        return eurekaClient.getApplication(appName).getName().length();
    }
}