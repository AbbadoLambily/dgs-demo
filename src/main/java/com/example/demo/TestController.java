package com.example.demo;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import org.nutz.json.Json;
import org.nutz.lang.Files;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@DgsComponent
@RestController
public class TestController {

    static List<Member> members;
    static {
        String data = Files.read("data.json");
        members = Json.fromJsonAsList(Member.class, data);
    }

    @DgsQuery
    @PostMapping("/member")
    public List<Member> member(){
        return members;
    }
}
