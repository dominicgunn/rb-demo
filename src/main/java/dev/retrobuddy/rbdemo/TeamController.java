package dev.retrobuddy.rbdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class TeamController {

    @RequestMapping("/teams")
    public List<String> teamList() {
        return Collections.singletonList("team-1");
    }
}