package org.app.medical.Controller;

import org.app.medical.Model.Gen;
import org.app.medical.Service.GenService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@RestController
public class GenJSController {

    private GenService genService;

    public GenJSController(GenService genService) {
        this.genService = genService;
    }

    @GetMapping("/search")
    public Gen getGen(@RequestParam("query") String query){
        System.out.println(query);
        return genService.getGen(query);
    }

    @GetMapping("/search-heatmap")
    public List<Gen> getGens(@RequestParam("query") String query){
        System.out.println(query);
        List<String> split = Arrays.asList(query.split(","));

        return genService.getGens(split);
    }

}
